package MiniCalculadora;

import java.sql.*;

public class TestConexionMySQL {
    public static void main(String[] args) {
        // Configuración de conexión
        String url = "jdbc:mysql://localhost:3306/calculadora";
        String user = "root";         // ← cambia si usas otro
        String pass = "";             // ← tu contraseña de MySQL

        // Operación de prueba
        double num1 = 10;
        double num2 = 5;
        String operador = "+";
        double resultado = num1 + num2;

        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ Driver JDBC cargado correctamente.");

            // Establecer conexión
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Conexión a MySQL establecida.");

            // Insertar operación
            String sql = "INSERT INTO historial (num1, operador, num2, resultado) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, num1);
            stmt.setString(2, operador);
            stmt.setDouble(3, num2);
            stmt.setDouble(4, resultado);
            int filas = stmt.executeUpdate();

            if (filas > 0) {
                System.out.println("✅ Operación guardada con éxito en la base de datos.");
            }

            // Cerrar conexión
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión o consulta SQL: " + e.getMessage());
        }
    }
}