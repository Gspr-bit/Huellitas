package huellitas;
import java.sql.*;

public class AnimalPerdido
{
    private String direccion;
    private String colonia;
    private String municipio;
    private String causa;
    private String telefono;
    private String correo;
    private int Animal_idAnimal;

    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;

    public AnimalPerdido() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public AnimalPerdido(String direccion, String colonia, String municipio, String causa, String telefono, String correo, int Animal_idAnimal) {
        this.direccion = direccion;
        this.colonia = colonia;
        this.municipio = municipio;
        this.causa = causa;
        this.telefono = telefono;
        this.correo = correo;
        this.Animal_idAnimal = Animal_idAnimal;
    }
    
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColonia() {
        return this.colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCausa() {
        return this.causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getAnimal_idAnimal() {
        return this.Animal_idAnimal;
    }

    public void setAnimal_idAnimal(int Animal_idAnimal) {
        this.Animal_idAnimal = Animal_idAnimal;
    }

    public String agregar() {
        try {
            this.st = conex.prepareStatement("INSERT INTO animalperdido VALUES(?,?,?,?,?,?,?)");
            this.st.setString(1, this.direccion);
            this.st.setString(2, this.colonia);
            this.st.setString(3, this.municipio);
            this.st.setString(4, this.causa);
            this.st.setString(5, this.telefono);
            this.st.setString(6, this.correo);
            this.st.setInt(7, this.Animal_idAnimal);
            this.st.executeUpdate();
            return "Se agrego:\n" + toString();
        } catch(SQLException ex) {
            return "Error en AnimalPerdido.agregar()\n" + ex.getMessage();
        }
    }
    
    public int registroExiste(String nombre) {
        try {
            this.st = conex.prepareStatement("SELECT idAnimal FROM animal WHERE nombre = ? && localizacion = \"Encontrados\"");
            this.st.setString(1, nombre);
            this.rs = this.st.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("idAnimal");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error animalperdido.registroExiste()\n" + ex.getMessage()); 
            return 0;
        }
    }

    public ResultSet consultar() {
        try {
            this.st = conex.prepareStatement("SELECT * FROM animalperdido");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en AnimalPerdido.consultar()\n" + ex.getMessage());
            return null;
        }
    }

    public ResultSet consultarId(int id) {
        try {
            this.st = conex.prepareStatement("SELECT * FROM animalperdido WHERE Animal_idAnimal = ?");
            this.st.setInt(1, id);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en AnimalPerdido.consultarId()\n" + ex.getMessage());
            return null;
        }
    }

    public String modificar(int id) {
        try {
            this.st = conex.prepareStatement("UPDATE animalperdido SET direccion = ?, colonia = ?, municipio = ?, causa = ?, telefono = ?, correo = ? WHERE Animal_idAnimal = ?");
            this.st.setString(1, this.direccion);
            this.st.setString(2, this.colonia);
            this.st.setString(3, this.municipio);
            this.st.setString(4, this.causa);
            this.st.setString(5, this.telefono);
            this.st.setString(6, this.correo);
            this.st.setInt(7, id);
            this.st.executeUpdate();
            return "Se modifico" + toString();
        } catch (SQLException ex) {
            return "Error en AnimalPerdido.modificar()\n" + ex.getMessage();
        }
    }

    public String eliminar(int id) {
        try {
            this.st = conex.prepareStatement("DELETE FROM animalperdido WHERE Animal_idAnimal = ?");
            this.st.setInt(1, id);
            this.st.executeUpdate();
            return "Se elimino";
        } catch(SQLException ex) {
            return "Error en AnimalPerdido.eliminar()\n" + ex.getMessage();
        }
    }

    @Override
    public String toString() {
        return "AnimalPerdido{" 
                + "direccion=" + direccion + ", "
                + "colonia=" + colonia + ", "
                + "municipio=" + municipio + ", "
                + "causa=" + causa + ", "
                + "telefono=" + telefono + ", "
                + "correo=" + correo + ", "
                + "Animal_idAnimal=" + Animal_idAnimal 
            + '}';
    }

    
}