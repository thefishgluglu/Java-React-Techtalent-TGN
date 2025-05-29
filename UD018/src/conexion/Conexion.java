package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar(String db) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + db + "?useSSL=false&serverTimezone=UTC",
                "root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}