import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class Login {
    public JPanel Panel;
    private JTextField TFUsuario;
    private JTextField TFContraseña;
    private JLabel Titulo;
    private JLabel Usuario;
    private JLabel Contraseña;
    private JButton INGRESARButton;

    public Conexion getConexion(){
        return new Conexion();
    }
    private String USUARIOREAL = "Profesor";
    private String  CONTRASENAREAL= "123456";



    public Login() {

        INGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioIngresado = TFUsuario.getText().trim();
                String passwordIngresado = TFContraseña.getText().trim();

                if (usuarioIngresado.isEmpty() || passwordIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (usuarioIngresado.equals(USUARIOREAL) && passwordIngresado.equals(CONTRASENAREAL)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    abrirVentanaPrincipal();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                    TFUsuario.setText("");
                    TFContraseña.setText("");
                    TFUsuario.requestFocus();
                }
            }
        });
    }

    private void abrirVentanaPrincipal() {
        SwingUtilities.invokeLater(() -> {
            JFrame framePrincipal = (JFrame) SwingUtilities.getWindowAncestor(Panel);
            framePrincipal.setContentPane(new GestionCalificaciones().getPanel2());
            framePrincipal.revalidate();
            framePrincipal.repaint();
        });
    }

    public JPanel getPanel() {
        return Panel;
    }
}
