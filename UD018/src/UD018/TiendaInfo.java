package UD018;

import java.sql.Connection;
import java.sql.Statement;
import conexion.Conexion;

public class TiendaInfo {
    public static void main(String[] args) {
        Connection con = Conexion.conectar("tiendainfo");
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO fabricantes (nombre) VALUES ('Samsung'), ('Sony')");
            stmt.executeUpdate("INSERT INTO articulos (nombre, precio, fabricante) VALUES ('TV', 500, 1), ('Cámara', 300, 2)");
            System.out.println("Registros insertados en tiendainfo correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
