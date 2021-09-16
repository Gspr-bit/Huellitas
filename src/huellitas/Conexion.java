package huellitas;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion
{
    private Connection conex;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conex = DriverManager.getConnection("jdbc:mysql://localhost/huellitas","root","");
            System.out.println("Si sirvio");
            
        } catch(SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getStackTrace());
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo conectar con el servidor, intentalo más tarde");
            System.exit(0);
        }
    }
    
    public Connection getConexion() {
        return this.conex;
    }
    
    public void cerrarConexion() {
        try {
            this.conex.close();
        } catch(SQLException ex) {
            ex.getStackTrace();
        }
    }
}