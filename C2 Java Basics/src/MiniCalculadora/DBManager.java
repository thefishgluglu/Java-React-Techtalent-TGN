package MiniCalculadora;

import java.sql.*;

public class DBManager {
    private final String URL = "jdbc:mysql://localhost:3306/calculadora?useSSL=false&serverTimezone=UTC";
    private final String USER = "root";      
    private final String PASS = "";          

    public DBManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✔ JDBC cargado.");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error al cargar JDBC: " + e.getMessage());
        }
    }

    public void guardarOperacion(double num1, String operador, double num2, double resultado) {
        String sql = "INSERT INTO historial (num1, operador, num2, resultado) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, num1);
            stmt.setString(2, operador);
            stmt.setDouble(3, num2);
            stmt.setDouble(4, resultado);
            stmt.executeUpdate();

            System.out.println("✔ Operación guardada: " + num1 + " " + operador + " " + num2 + " = " + resultado);

        } catch (SQLException e) {
            System.out.println("❌ Error al guardar: " + e.getMessage());
        }
    }

    public ResultSet obtenerHistorial() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = conn.createStatement();
        return stmt.executeQuery("SELECT * FROM historial ORDER BY fecha DESC");
    }
}
