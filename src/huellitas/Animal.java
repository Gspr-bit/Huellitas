/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huellitas;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Alumno
 */
public class Animal {
    private int idAnimal;
    private String nombre;
    private String foto;
    private String tipoFoto;
    private String especie;
    private String raza;
    private String size;
    private String sexo;
    private int edad;
    private boolean esterilizado;
    private String fecha;
    private String caracteristicas;
    private String localizacion;

    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;
    
    private File file;
    private FileInputStream fis;

    public Animal() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public Animal(int idAnimal, String nombre, String foto, String tipoFoto, String especie, String raza, String size, String sexo, int edad, boolean esterilizado, String fecha, String caracteristicas, String localizacion) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.foto = foto;
        this.tipoFoto = foto;
        this.especie = especie;
        this.raza = raza;
        this.size = size;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizado = esterilizado;
        this.fecha = fecha;
        this.caracteristicas = caracteristicas;
        this.localizacion = localizacion;
    }

    public int getIdAnimal() {
        return this.idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public String getTipoFoto() {
        return tipoFoto;
    }

    public void setTipoFoto(String tipoFoto) {
        this.tipoFoto = tipoFoto;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsterilizado() {
        return this.esterilizado;
    }

    public boolean getEsterilizado() {
        return this.esterilizado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    public String agregar() {
        try {
            file = new File(this.foto);
            fis = new FileInputStream(file);
            
            this.st = conex.prepareStatement("INSERT INTO animal VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            this.st.setInt(1, this.idAnimal);
            this.st.setString(2, this.nombre);
            this.st.setBinaryStream(3, fis, (int)file.length());
            this.st.setString(4, this.tipoFoto);
            this.st.setString(5, this.especie);
            this.st.setString(6, this.raza);
            this.st.setString(7, this.size);
            this.st.setString(8, this.sexo);
            this.st.setInt(9, this.edad);
            this.st.setBoolean(10, this.esterilizado);
            this.st.setString(11, this.fecha);
            this.st.setString(12, this.caracteristicas);
            this.st.setString(13, this.localizacion);
            this.st.executeUpdate();
            
            return "Se agrego:  "+ toString();
        } catch(SQLException | FileNotFoundException ex) {
            return "Error en Animal.agregar()";
        }
    }

    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM animal");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en animal.consultar()" + ex.getMessage());
            return null;
        }
    }
    
    public ResultSet consultarEn(String localizacion, String ordenar, String orden) {
        String sql = "SELECT * FROM animal WHERE localizacion = ? ORDER BY " + ordenar + " " + orden;
        try {
            this.st = this.conex.prepareStatement(sql);
            this.st.setString(1, localizacion);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Animal.consultarEn()" + ex.getMessage());
            return null;
        }
    }

    public ResultSet consultarPor(String localizacion, String columna, String valor) {
        String sql = "SELECT * FROM animal WHERE localizacion = ? && " + columna + " = ?";
        try {
            this.st = this.conex.prepareStatement(sql);            
            this.st.setString(1, localizacion);
            this.st.setString(2, valor);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en animal.consultarEn()" + ex.getMessage());
            return null;
        }
    }
    public ResultSet consultarNombre(String localizacion, String nombre) {
        String caracteres [] = new String[nombre.length()];
        for (int i = 0; i < nombre.length(); i++) {
            caracteres[i] = nombre.charAt(i) + "%";
        }
        nombre = "";
        for (int i = 0; i < caracteres.length; i++) {
            nombre += caracteres[i];
        }
        String sql = "SELECT * FROM animal WHERE localizacion = ? && nombre LIKE \"%" + nombre + "\"";
        try {
            this.st = this.conex.prepareStatement(sql);            
            this.st.setString(1, localizacion);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Animal.consultarEn()" + ex.getMessage());
            return null;
        }
    }
    
    public ResultSet consultarId(int id) {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM animal WHERE idAnimal = ?");
            this.st.setInt(1, id);
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Animal.consultarId()" + ex.getMessage());
            return null;
        }
    }

    public String eliminar(int id) {
        try {
            this.st = this.conex.prepareStatement("DELETE FROM animal WHERE idAnimal = ?");
            this.st.setInt(1, id);
            this.st.executeUpdate();
            return "Animal borrado";
        } catch (SQLException ex){            
            return "Error en Animal.eliminar()\n" + ex.getMessage();
        }
    }
    
    public String enviarA(int id, String localizacion, String fecha) {
        try {
            this.st = this.conex.prepareStatement("UPDATE animal SET localizacion = ?, fecha = ? WHERE idAnimal = " + id);
            this.st.setString(1, localizacion);
            this.st.setString(2, fecha);
            this.st.executeUpdate();
            return "Se envio";
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return "Error en Animal.enviarA():\n" + ex.getMessage();
        }
    }
    
    public int regresarId() {
        try {
            this.st = this.conex.prepareStatement("SELECT idAnimal FROM animal ORDER BY idAnimal DESC LIMIT 1");
            this.rs = this.st.executeQuery();
            if (rs.next()) {
                return rs.getInt("idAnimal");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error en Animal.consultarId()" + ex.getMessage());
            return 0;
        }
    }

    public String modificar(int id,boolean cambioFoto) {
        try {            
            String sql = "UPDATE animal SET nombre = ?";
            if (cambioFoto){
                sql += ", foto = ?, tipoFoto = ?";
                file = new File(this.foto);
                fis = new FileInputStream(file);
            }
            sql += ", especie = ?,  raza = ?, size = ?, sexo = ?, edad = ?, esterilizado = ?, fecha = ?, caracteristicas = ?, localizacion = ? WHERE idAnimal =?";
            this.st = this.conex.prepareStatement(sql);
            this.st.setString(1, this.nombre);
            if(cambioFoto){                
                this.st.setBinaryStream(2, fis, (int)file.length());
                this.st.setString(3, this.tipoFoto);
                this.st.setString(4, this.especie);
                this.st.setString(5, this.raza);
                this.st.setString(6, this.size);
                this.st.setString(7, this.sexo);
                this.st.setInt(8, this.edad);
                this.st.setBoolean(9, this.esterilizado);
                this.st.setString(10, this.fecha);
                this.st.setString(11, this.caracteristicas);
                this.st.setString(12, this.localizacion);
                this.st.setInt(13, id);            
            } else {
                this.st.setString(2, this.especie);
                this.st.setString(3, this.raza);
                this.st.setString(4, this.size);
                this.st.setString(5, this.sexo);
                this.st.setInt(6, this.edad);
                this.st.setBoolean(7, this.esterilizado);
                this.st.setString(8, this.fecha);
                this.st.setString(9, this.caracteristicas);
                this.st.setString(10, this.localizacion);
                this.st.setInt(11, id);         
            }            
            this.st.executeUpdate();
            return "Se modifico: " + toString();            
        } catch (SQLException | FileNotFoundException ex) {
            return "Error en Animal.modificar()\n" + ex.getMessage();
        }     
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", nombre=" + nombre + ", foto=" + foto + ", especie=" + especie + ", raza=" + raza + ", size=" + size + ", sexo=" + sexo + ", edad=" + edad + ", esterilizado=" + esterilizado + ", fecha=" + fecha + ", caracteristicas=" + caracteristicas + ", localizacion=" + localizacion + '}';
    }
    
}
