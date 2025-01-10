import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionCalificaciones {
    public JPanel Panel2;
    private JLabel NombreGN;
    private JLabel TituloGN;
    private JLabel Cedulagn;
    private JTextField TFCedulagn;
    private JTextField TFNombreGN;
    private JLabel Materia1;
    private JTextField TFMateria1;
    private JTextField TFNombreGN2;
    private JTextField TFNombreGN3;
    private JTextField TFNombreGN4;
    private JTextField TFNombreGN5;
    private JButton ingresarGNButton;
    private JLabel Materia2;
    private JLabel Materia3;
    private JLabel Materia4;
    private JLabel Materia5;

    private Insertar insertar;

    public GestionCalificaciones() {
        try {
            // Establecer conexión a la base de datos
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/PruebaPOO", "root", "123456");
            insertar = new Insertar(connection);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,
                    "Error al conectar con la base de datos: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

       /* ingresarGNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para insertar un dato
                String cedula = TFCedulagn.getText().trim();
                String nombre = TFNombreGN.getText().trim();
                String materia1 = TFMateria1.getText().trim();
                String nombre2 = TFNombreGN2.getText().trim();
                String nombre3 = TFNombreGN3.getText().trim();
                String nombre4 = TFNombreGN4.getText().trim();
                String nombre5 = TFNombreGN5.getText().trim();
            }





        };*/
    }
        public JPanel getPanel2() {
            return Panel2;
        }
}
