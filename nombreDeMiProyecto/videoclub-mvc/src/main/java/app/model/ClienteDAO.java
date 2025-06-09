package app.model;

import java.sql.*;
import java.util.*;

public class ClienteDAO {
    private Connection con;

    public ClienteDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub", "root", "tu_contraseña");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> obtenerClientes() {
        List<Cliente> lista = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setDni(rs.getString("dni"));
                c.setFecha(rs.getString("fecha"));
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
