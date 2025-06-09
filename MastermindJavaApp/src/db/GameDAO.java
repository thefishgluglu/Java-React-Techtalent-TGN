package db;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.Duration;
import model.User;

public class GameDAO {

	public static void saveGame(User user, LocalDateTime start, LocalDateTime end, boolean won, int rounds) {
        String sql = "INSERT INTO games (user_id, start_time, end_time, duration_seconds, result, rounds) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            Duration duration = Duration.between(start, end);

            stmt.setInt(1, user.getId());
            stmt.setTimestamp(2, Timestamp.valueOf(start));
            stmt.setTimestamp(3, Timestamp.valueOf(end));
            stmt.setInt(4, (int) duration.getSeconds());
            stmt.setString(5, won ? "win" : "lose");
            stmt.setInt(6, rounds); // Aquí deberías calcular el número de rondas jugadas
            

            stmt.executeUpdate();
            System.out.println("📦 Partida guardada en la base de datos.");

        } catch (SQLException e) {
            System.err.println("❌ Error al guardar partida: " + e.getMessage());
        }
    }
}
