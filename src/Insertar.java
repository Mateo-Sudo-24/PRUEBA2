import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class Insertar {

    private Connection con;
    public Insertar(Connection con) {
        this.con = con;

    }
    public boolean insertar(String cedula, String nombre , double estudiante1,
    double estudiante2, double estudiante3, double estudiante4, double estudiante5) {
        String sql = "INSERT INTO estudiantes (cedula,nombre,estudiante1,estudiante2,estudainte3,estudainte4,estudainte5) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setDouble(3, estudiante1);
            ps.setDouble(4, estudiante2);
            ps.setDouble(5, estudiante3);
            ps.setDouble(6, estudiante4);
            ps.setDouble(7, estudiante5);
            return ps.executeUpdate() > 0; // Devuelve true si se insertó correctamente
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }


}
