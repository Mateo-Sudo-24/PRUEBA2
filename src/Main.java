import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Login");
            Login login = new Login();
            frame.setContentPane(login.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
            Connection conexion = Conexion.getConnection();

            if (conexion != null) {
                try {
                    System.out.println("Conectado a la base de datos");
                    conexion.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            } else {
                System.out.println("Error al cargar la base de datos");

            }
        }

}