package huellitas;
import huellitas.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class Adopcion
{
    private String nombre;
    private int edad;
    private String ocupacion;
    private String direccion;
    private String colonia;
    private String municipio;
    private String correo;
    private String celular;
    private String telefonoFijo;
    private String nombreReferencia;
    private String telefonoReferencia;
    private int folio;
    private String credencial;
    private String tipoCredencial;
    private String comprobanteDomicilio;
    private String tipoComprobante;
    private int Animal_idAnimal;    

    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;

    private File fileCredencial;
    private FileInputStream fisCredencial;
    private File fileComprobante;
    private FileInputStream fisComprobante;

    public Adopcion() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public Adopcion(String nombre, int edad, String ocupacion, String direccion, String colonia, String municipio, String correo, String celular, String telefonoFijo, String nombreReferencia, String telefonoReferencia, int folio, String credencial, String tipoCredencial, String comprobanteDomicilio, String tipoComprobante, int Animal_idAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.colonia = colonia;
        this.municipio = municipio;
        this.correo = correo;
        this.celular = celular;
        this.telefonoFijo = telefonoFijo;
        this.nombreReferencia = nombreReferencia;
        this.telefonoReferencia = telefonoReferencia;
        this.folio = folio;
        this.credencial = credencial;
        this.tipoCredencial = tipoCredencial;
        this.comprobanteDomicilio = comprobanteDomicilio;
        this.tipoComprobante = tipoComprobante;
        this.Animal_idAnimal = Animal_idAnimal;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return this.ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefonoFijo() {
        return this.telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getNombreReferencia() {
        return this.nombreReferencia;
    }

    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }

    public String getTelefonoReferencia() {
        return this.telefonoReferencia;
    }

    public void setTelefonoReferencia(String telefonoReferencia) {
        this.telefonoReferencia = telefonoReferencia;
    }

    public int getFolio() {
        return this.folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getCredencial() {
        return this.credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getTipoCredencial() {
        return tipoCredencial;
    }

    public void setTipoCredencial(String tipoCredencial) {
        this.tipoCredencial = tipoCredencial;
    }
    
    public String getComprobanteDomicilio() {
        return this.comprobanteDomicilio;
    }

    public void setComprobanteDomicilio(String comprobanteDomicilio) {
        this.comprobanteDomicilio = comprobanteDomicilio;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
    
    public int getAnimal_idAnimal() {
        return this.Animal_idAnimal;
    }

    public void setAnimal_idAnimal(int Animal_idAnimal) {
        this.Animal_idAnimal = Animal_idAnimal;
    }

    public String agregar() {
        try {
            fileCredencial = new File(this.credencial);
            fisCredencial = new FileInputStream(fileCredencial);
            fileComprobante = new File(this.comprobanteDomicilio);
            fisComprobante = new FileInputStream(fileComprobante);            

            this.st = conex.prepareStatement("INSERT INTO adopcion VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            this.st.setString(1, this.nombre);
            this.st.setInt(2, this.edad);
            this.st.setString(3, this.ocupacion);
            this.st.setString(4, this.direccion);
            this.st.setString(5, this.colonia);
            this.st.setString(6, this.municipio);
            this.st.setString(7, this.correo);
            this.st.setString(8, this.celular);
            this.st.setString(9, this.telefonoFijo);
            this.st.setString(10, this.nombreReferencia);
            this.st.setString(11, this.telefonoReferencia);
            this.st.setInt(12, this.folio);
            this.st.setBinaryStream(13, fisCredencial, (int)fileCredencial.length());
            this.st.setString(14, this.tipoCredencial);
            this.st.setBinaryStream(15, fisComprobante, (int)fileComprobante.length());
            this.st.setString(16, this.tipoComprobante);
            this.st.setInt(17, this.Animal_idAnimal);
            this.st.executeUpdate();
            return "Se agrego:  "+ toString();
        } catch(SQLException | FileNotFoundException ex) {
            return "Error en Adopcion.agregar()";
        }
    }
    
    public ResultSet consultarId(int id) {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM adopcion WHERE Animal_idAnimal = ?");
            this.st.setInt(1, id);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Adopcion.consultarId()" + ex.getMessage());
            return null;
        }
    }

    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM adopcion");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Adopcion.consultar()" + ex.getMessage());
            return null;
        }
    }
    
    public String modificar(int id, boolean cambioCredencial, boolean cambioComprobante) {
        try {    
            String sql = "UPDATE adopcion SET"
                    + " nombre = ?"
                    + ", edad = ?"
                    + ", ocupacion = ?"
                    + ", direccion = ?"
                    + ", colonia = ?"
                    + ", municipio = ?"
                    + ", correo = ?"
                    + ", celular = ?"
                    + ", telefonoFijo = ?"
                    + ", nombreReferencia = ?"
                    + ", telefonoReferencia = ?"
                    + ", folio = ? ";
            if (cambioCredencial) {
                sql += ", credencial = ?, tipoCredencial = ? ";
                fileCredencial = new File(this.credencial);
                fisCredencial = new FileInputStream(fileCredencial);
            }
            if (cambioComprobante) {
                sql += ", comprobanteDomicilio = ?, tipoComprobante = ? ";
                fileComprobante = new File(this.comprobanteDomicilio);
                fisComprobante = new FileInputStream(fileComprobante);
            }
            sql += "WHERE Animal_idAnimal = " + id;
        
            this.st = this.conex.prepareStatement(sql);
            this.st.setString(1, this.nombre);
            this.st.setInt(2, this.edad);
            this.st.setString(3, this.ocupacion);
            this.st.setString(4, this.direccion);
            this.st.setString(5, this.colonia);
            this.st.setString(6, this.municipio);
            this.st.setString(7, this.correo);
            this.st.setString(8, this.celular);
            this.st.setString(9, this.telefonoFijo);
            this.st.setString(10, this.nombreReferencia);
            this.st.setString(11, this.telefonoReferencia);
            this.st.setInt(12, this.folio);
            
            if (cambioCredencial && cambioComprobante) {
                st.setBinaryStream(13, fisCredencial, (int)fileCredencial.length());
                st.setString(14, this.tipoCredencial);
                st.setBinaryStream(15, fisComprobante, (int)fileComprobante.length());
                st.setString(16, this.tipoComprobante);
            } else if (cambioCredencial) {
                st.setBinaryStream(13, fisCredencial, (int)fileCredencial.length()); 
                st.setString(14, this.tipoCredencial);
            } else if (cambioComprobante) {
                st.setBinaryStream(13, fisComprobante, (int)fileComprobante.length());
                st.setString(14, this.tipoComprobante);
            }    
            
            this.st.executeUpdate();
            return "Se modifico: " + toString();            
        } catch (SQLException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return "Error en Adopcion.modificar()\n" + ex.getMessage();
        }        
    }

    public String eliminar(int id) {
        try {
        this.st = this.conex.prepareStatement("DELETE FROM adopcion WHERE Animal_idAnimal = ?");
        this.st.setInt(1, id);
        this.st.executeUpdate();
        return "Datos borrados";
        } catch (SQLException ex){            
            return "Error en Adopcion.eliminar()\n" + ex.getMessage();
        }
    }

    @Override
    public String toString() {
        return "{" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", ocupacion='" + getOcupacion() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", colonia='" + getColonia() + "'" +
            ", municipio='" + getMunicipio() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", celular='" + getCelular() + "'" +
            ", telefonoFijo='" + getTelefonoFijo() + "'" +
            ", nombreReferencia='" + getNombreReferencia() + "'" +
            ", telefonoReferencia='" + getTelefonoReferencia() + "'" +
            ", folio='" + getFolio() + "'" +
            ", credencial='" + getCredencial() + "'" +
            ", comprobanteDomicilio='" + getComprobanteDomicilio() + "'" +
            ", Animal_idAnimal='" + getAnimal_idAnimal() + "'" +
            "}";
    }
}