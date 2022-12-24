import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection() throws SQLException{
        Connection conn = null;

            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "Test12345.");
            }catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        return conn;
    }

    public static void closeConnection(Connection conn) throws SQLException{
        try{
            conn.close();
        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        } finally {
            conn.close();
        }
    }
}
