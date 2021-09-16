/*
 * 
 */
package huellitas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gspr-bit
 */
public class Comandos {
    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;
    private ResultSet consulta;

    public ResultSet getConsulta() {
        return consulta;
    }

    public void setConsulta(ResultSet consulta) {
        this.consulta = consulta;
    }

    public Comandos() {
        this.con = new Conexion();
        this.conex = this.con.getConexion();
    }
    
    /**
     * This methid receives the comando variable and executes it as a SQL command
     * @param comando
     * @return "ResultSet" if the statement throws a ResultSet, 
     *  "Ok" if the statements doesn't throws anything and was executed ok
     *  SQLException message
     */
    public String consola(String comando) {
        try {
            this.st = conex.prepareStatement(comando);
            
            if (this.st.execute()) {
                this.rs = this.st.executeQuery();
                setConsulta(this.rs);
                return "ResultSet";
            } else {
                return "Ok";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
}
