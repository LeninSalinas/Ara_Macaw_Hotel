import java.sql.*;
public class Conexion 
{
     Connection c;
     public Conexion(String db) {
        try {
            /* Driver */
            String driver = "com.mysql.jdbc.Driver";
            System.out.println("=> Cargando el Driver:");
            Class.forName(driver);
            System.out.println("Driver OK");

            /* Definiendo Base de Datos */
            String url = "jdbc:mysql://localhost/" + db;
            String user = "root";
            String pass = "";

            /* Conectando */
            System.out.println("=> conectando a la BD:");
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de Datos OK");

        } catch (ClassNotFoundException | SQLException x) {
            System.out.println("Error al tratar de conectar a la BD! " + x);
        }
    }

    public Connection getConexion() {
        return c;
    }

    public static void main(String args[]) {
        new Conexion("ejeautos");
    }
}