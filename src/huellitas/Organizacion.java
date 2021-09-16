/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huellitas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daga4
 */
public class Organizacion {
    private String nombre;
    private String foto;
    
    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;
    
    private File file;
    private FileInputStream fis;

    public Organizacion() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public Organizacion(String nombre, String foto) {
        this.nombre = nombre;
        this.foto = foto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public String agregar() {
        try {
            file = new File(this.foto);
            fis = new FileInputStream(file);
            
            this.st = conex.prepareStatement("INSERT INTO organizacion VALUES(?,?)");
            this.st.setString(1, this.nombre);
            this.st.setBinaryStream(2, fis, (int)file.length());
            this.st.executeUpdate();
            
            return "Se agrego: ";
        } catch (SQLException | FileNotFoundException ex) {
            return "Error en Organizacion.agregar():\n" + ex.getMessage();
        }
    }
    
    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM organizacion");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en organizacion.consultar():\n" + ex.getMessage());
            return null;
        }
    }
    
    public boolean existe() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM organizacion");
            this.rs = this.st.executeQuery();
            if (this.rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error en organizacion.Existe():\n" + ex.getMessage());
            return false;
        }
    }
}
