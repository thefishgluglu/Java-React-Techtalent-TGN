package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/mastermind_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Cambia si tu MySQL tiene contraseña

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conectado a MySQL.");
            return conn;
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Driver JDBC no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar: " + e.getMessage());
        }
        return null;
    }
}
