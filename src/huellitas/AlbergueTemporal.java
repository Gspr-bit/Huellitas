package huellitas;
import java.sql.*;

public class AlbergueTemporal
{
    private String diagnostico;
    private String avance;
    private int Animal_idAnimal;

    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;

    public AlbergueTemporal() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public AlbergueTemporal(String diagnostico, String avance, int Animal_idAnimal) {
        this.diagnostico = diagnostico;
        this.avance = avance;
        this.Animal_idAnimal = Animal_idAnimal;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getAvance() {
        return this.avance;
    }

    public void setAvance(String avance) {
        this.avance = avance;
    }

    public int getAnimal_idAnimal() {
        return this.Animal_idAnimal;
    }

    public void setAnimal_idAnimal(int Animal_idAnimal) {
        this.Animal_idAnimal = Animal_idAnimal;
    }
    
    public String agregar() {
        try {
            this.st = conex.prepareStatement("INSERT INTO alberguetemporal VALUES(?,?,?)");
            this.st.setString(1, this.diagnostico);
            this.st.setString(2, this.avance);
            this.st.setInt(3, this.Animal_idAnimal);
            this.st.executeUpdate();
            return "Se agrego:  "+ toString();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return "Error en AlbergueTemporal.agregar()";
        }
    }

    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM alberguetemporal");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en AlbergueTemporal.consultar()" + ex.getMessage());
            return null;
        }
    }

    public ResultSet consultarId(int id) {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM alberguetemporal WHERE Animal_idAnimal = ?");
            this.st.setInt(1, id);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en AlbergueTemporal.consultarId()" + ex.getMessage());
            return null;
        }
    }
       
    public String eliminar(int id) {
        try {
        this.st = this.conex.prepareStatement("DELETE FROM AlbergueTemporal WHERE Animal_idAnimal = ?");
        this.st.setInt(1, id);
        this.st.executeUpdate();
        return "Animal borrado";
        } catch (SQLException ex){            
            return "Error en AlbergueTemporal.eliminar()\n" + ex.getMessage();
        }
    }
    
    public String modificar(int id) {
        try {
            this.st = this.conex.prepareStatement("UPDATE alberguetemporal SET diagnostico = ?, avance = ? WHERE Animal_idAnimal = ?");
            this.st.setString(1, this.diagnostico);
            this.st.setString(2, this.avance);
            this.st.setInt(3, id);          
            this.st.executeUpdate();
            return "Se modifico: " + toString();            
        } catch (SQLException ex) {
            return "Error en AlbergueTemporal.modificar()\n" + ex.getMessage();
        }        
    }

    @Override
    public String toString() {
        return "{" +
            ", diagnostico='" + getDiagnostico() + "'" +
            ", avance='" + getAvance() + "'" +
            ", Animal_idAnimal='" + getAnimal_idAnimal() + "'" +
            "}";
    }
    
}