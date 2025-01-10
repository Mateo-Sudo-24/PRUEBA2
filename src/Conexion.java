import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url = "jdbc:mysql://localhost:3306/PruebaPOO";
    private static String usuario = "root";
    private static String password = "123456";

    public static  Connection getConnection() {
            Connection con = null;
            try {
                con = DriverManager.getConnection(url, usuario, password);
                System.out.println("Conecatado correctamente a la BDD");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error al ingresar");
            }return con;
    }
}
