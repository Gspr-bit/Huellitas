package huellitas;
import java.sql.*;
import java.util.Calendar;

public class Notificaciones
{
    private Validaciones validar;
    
    private int idNotificacion;
    private String fecha;
    private boolean repetir;
    private String intervalo;
    private int intervaloNum;
    private String mensaje;

    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;  
        
    public Notificaciones() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public Notificaciones(int idNotificacion, String fecha, boolean repetir, String intervalo, int intervaloNum, String mensaje) {
        this.idNotificacion = idNotificacion;
        this.fecha = fecha;
        this.repetir = repetir;
        this.intervalo = intervalo;
        this.intervaloNum = intervaloNum;
        this.mensaje = mensaje;
    }

    public int getIdNotificacion() {
        return this.idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isRepetir() {
        return this.repetir;
    }

    public boolean getRepetir() {
        return this.repetir;
    }

    public void setRepetir(boolean repetir) {
        this.repetir = repetir;
    }

    public String getIntervalo() {
        return this.intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public int getIntervaloNum() {
        return intervaloNum;
    }

    public void setIntervaloNum(int intervaloNum) {
        this.intervaloNum = intervaloNum;
    }
    
    

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String agregar() {
        try {
            this.st = conex.prepareStatement("INSERT INTO notificaciones VALUES(?,?,?,?,?,?)");
            this.st.setInt(1, this.idNotificacion);
            this.st.setString(2, this.fecha);
            this.st.setBoolean(3, this.repetir);
            this.st.setString(4, this.intervalo);
            this.st.setInt(5, this.intervaloNum);
            this.st.setString(6, this.mensaje);
            this.st.executeUpdate();
            return "Se agrego:  "+ toString();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return "Error en Notificaciones.agregar()";
        }
    }

    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM notificaciones WHERE fecha <= NOW() ORDER BY Fecha DESC");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Notificaciones.consultar()" + ex.getMessage());
            return null;
        }
    }

    public ResultSet consultarId(int id) {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM notificaciones WHERE idNotificacion = ?");
            this.st.setInt(1, id);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Notificaciones.consultarId()" + ex.getMessage());
            return null;
        }
    }    

    public String eliminar(int id) {
        try {
        this.st = this.conex.prepareStatement("DELETE FROM notificaciones WHERE idNotificacion = ?");
        this.st.setInt(1, id);
        this.st.executeUpdate();
        return "Notificacion borrada";
        } catch (SQLException ex){            
            return "Error en Notificaciones.eliminar()\n" + ex.getMessage();
        }
    }

    /**
     * This method reads a date and adds the specified days, months and years
     * The date's format must be: YYYY-MM-DD
     * @param id
     * @param date
     * @param years
     * @param meses
     * @param dias
     * @return "Se modifico" if the update is successfull, 
     * else "Error en Notificaciones.repetir()\n" + ex.getMessage();
     * @see Validaciones.sumarDias();
     */
    public String repetir(int id, String date, int years, int meses, int dias) {
        validar = new Validaciones();
        try {
            this.st = this.conex.prepareStatement("UPDATE notificaciones SET fecha = ? WHERE idNotificacion = ?");
//            this.st.setString(1, resultado);
            this.st.setString(1, validar.sumarDias(date, years, meses, dias));
            this.st.setInt(2, id);         
            this.st.executeUpdate();
            return "Se modifico: " + toString();            
        } catch (SQLException ex) {
            return "Error en Notificaciones.repetir()\n" + ex.getMessage();
        }   
    }

    /**
     * This method verifies if there are current or past notifications
     * @return true if there are notifications, else false
     */
    public boolean hayNotificaciones() {
        Calendar actual = Calendar.getInstance();
        String x;
        boolean resultado = false;
        String mes;
        String dia;
        try {
            this.st = this.conex.prepareStatement("SELECT fecha FROM notificaciones");
            this.rs = this.st.executeQuery();

            String year = actual.get(Calendar.YEAR) + "";
            if ((actual.get(Calendar.MONTH) + 1) < 10) {
                mes = "0" + (actual.get(Calendar.MONTH) + 1);
            } else {
                mes = "" + (actual.get(Calendar.MONTH) + 1);
            }
            if (actual.get(Calendar.DATE) < 10) {
                dia = "0" + (actual.get(Calendar.DATE));
            } else {
                dia = "" + (actual.get(Calendar.DATE));
            }                       
            
            while (rs.next()) {
                x = rs.getString("fecha");
                
                if (x.equals(year + "-" + mes + "-" + dia)) {
                    resultado = true;
                } 
            }
            return resultado;
        } catch (SQLException ex) {
            System.out.println("Error en Notificaciones.hayNotificaciones()" + ex.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " idNotificacion='" + getIdNotificacion() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", repetir='" + isRepetir() + "'" +
            ", intervalo='" + getIntervalo() + "'" +
            ", intervaloNum='" + getIntervaloNum() + "'" +
            ", mensaje='" + getMensaje() + "'" +
            "}";
    }
}