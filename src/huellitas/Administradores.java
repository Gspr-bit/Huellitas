package huellitas;
import java.sql.*;

public class Administradores
{
    private int idAdministrador;
    private String nombre;
    private String password;
    private boolean principal;

    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;

    public Administradores() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public Administradores(int idAdministrador, String nombre, String password, boolean principal) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.password = password;
        this.principal = principal;
    }

    public int getIdAdministrador() {
        return this.idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPrincipal() {
        return this.principal;
    }

    public boolean getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public String agregar() {
        try {
            this.st = conex.prepareStatement("INSERT INTO administradores VALUES(?,?,?,?)");
            this.st.setInt(1, this.idAdministrador);
            this.st.setString(2, this.nombre);
            this.st.setString(3, this.password);
            this.st.setBoolean(4, this.principal);
            this.st.executeUpdate();
            return "Se agrego: "+ toString();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return "Error en Administradores.agregar()";
        }
    }
    
    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT nombre FROM administradores");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Administradores.consultar()" + ex.getMessage());
            return null;
        }
    }
    
    public ResultSet consultarId(int id) {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM administradores WHERE idAdministrador = ?");
            this.st.setInt(1, id);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Administradores.consultarId()" + ex.getMessage());
            return null;
        }
    }

    public String eliminar(String id) {
        try {
        this.st = this.conex.prepareStatement("DELETE FROM administradores WHERE nombre = ?");
        this.st.setString(1, id);
        this.st.executeUpdate();
        return "Usuario borrado";
        } catch (SQLException ex){            
            return "Error en Administradores.eliminar()\n" + ex.getMessage();
        }
    }
    
    public String login(String nombre, String password) {
        String pw = null;
        try {
            this.st = conex.prepareStatement("SELECT password FROM administradores WHERE nombre = ?");
            this.st.setString(1, nombre);
            this.rs = this.st.executeQuery();
                        
            if (rs.next()) {
                pw = rs.getString("password");
                if (pw.equals(password)) {
                    return "true";
                } else {
                    return "Contraseña incorrecta";
                }
            } else {
                return "Nombre de usuario incorrecto";
            }
        } catch (SQLException ex) {
            return "Error administradores.login()\n" + ex.getMessage();
        }
    }
    
    public boolean usuarioExiste(String nombre) {
        String pw = null;
        try {
            this.st = conex.prepareStatement("SELECT nombre FROM administradores WHERE nombre = ?");
            this.st.setString(1, nombre);
            this.rs = this.st.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error administradores.usuarioExiste()\n" + ex.getMessage()); 
            return false;
        }
    }
    
    public boolean hayUsuarios() {
        try {
            this.st = conex.prepareStatement("SELECT nombre FROM administradores");
            this.rs = this.st.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error administradores.hayUsuarios()\n" + ex.getMessage()); 
            return false;
        }
    }

    public String modificar(String id) {
        try {
            this.st = this.conex.prepareStatement("UPDATE administradores SET nombre = ?, password = ? WHERE nombre = ?");
            this.st.setString(1, this.nombre);
            this.st.setString(2, this.password); 
            this.st.setString(3, id);         
            this.st.executeUpdate();
            return "Se modifico: " + toString();            
        } catch (SQLException ex) {
            return "Error en Administradores.modificar()\n" + ex.getMessage();
        }        
    }
    
    public boolean esAdministrador(String nombre) {
        try {
            this.st = this.conex.prepareStatement("SELECT principal FROM administradores WHERE nombre = ?");
            this.st.setString(1, nombre);
            this.rs = this.st.executeQuery();
            if (rs.next()) {
                return rs.getBoolean("principal");
            } else {
                return false;
            }            
        } catch (SQLException ex) {
            System.out.println("Error en Administradores.esAdministrador()" + ex.getMessage());
            return true;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " idAdministrador='" + getIdAdministrador() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", password='" + getPassword() + "'" +
            ", principal='" + isPrincipal() + "'" +
            "}";
    }
    
}