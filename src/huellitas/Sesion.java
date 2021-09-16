/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huellitas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daga4
 */
public class Sesion {
    private String usuario;
    private boolean root;
    
    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;
    
    public Sesion() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }

    public Sesion(String usuario, boolean root) {
        this.usuario = usuario;
        this.root = root;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }
    
    public String crear() {
        try {
            this.st = conex.prepareStatement("CREATE TEMPORARY TABLE sesion (usuario VARCHAR(20), root BOOLEAN)");
            this.st.executeUpdate();
            return "Se creo";
        } catch (SQLException ex) {
            return "Error en Sesion.crear():\n" + ex.getMessage();
        }
    }
    
    public String agregar() {
        try {
            this.st = conex.prepareStatement("INSERT INTO sesion VALUES(?,?)");
            this.st.setString(1, this.usuario);
            this.st.setBoolean(2, this.root);
            this.st.executeUpdate();
            return "Se agrego:  "+ toString();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return "Error en Sesion.agregar()";
        }
    }
    
    public ResultSet consultar() {
        try {
            this.st = this.conex.prepareStatement("SELECT * FROM sesion");
            this.rs = this.st.executeQuery();
            return this.rs;
        } catch (SQLException ex) {
            System.out.println("Error en Sesion.consultar()" + ex.getMessage());
            return null;
        }
    }
    
    public String eliminar() {
        try {
        this.st = this.conex.prepareStatement("DELETE FROM sesion");
        this.st.executeUpdate();
        return "Se elimino";
        } catch (SQLException ex){            
            return "Error en Administradores.eliminar()\n" + ex.getMessage();
        }
    }

    @Override
    public String toString() {
        return "Sesion{" + "usuario=" + usuario + ", root=" + root + '}';
    }
}