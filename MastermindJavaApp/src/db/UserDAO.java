package db;

import java.sql.*;
import model.User;

public class UserDAO {

    public static boolean registerUser(User user) {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getUsername().trim());
            stmt.setString(2, user.getPassword().trim());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("❌ Error al registrar: " + e.getMessage());
            return false;
        }
    }

    public static boolean loginUser(User user) {
        String sql = "SELECT id FROM users WHERE username = ? AND password = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user.setId(rs.getInt("id")); // Guarda el ID en el objeto
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.err.println("❌ Error en login: " + e.getMessage());
            return false;
        }
    }
}
