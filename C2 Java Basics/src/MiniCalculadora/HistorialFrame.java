package MiniCalculadora;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class HistorialFrame extends JFrame {

    public HistorialFrame(DBManager dbManager) {
        setTitle("Historial de Cálculos");
        setSize(600, 300);
        setLocationRelativeTo(null);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Num1");
        modelo.addColumn("Operador");
        modelo.addColumn("Num2");
        modelo.addColumn("Resultado");
        modelo.addColumn("Fecha");

        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        try {
            ResultSet rs = dbManager.obtenerHistorial();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getDouble("num1"),
                    rs.getString("operador"),
                    rs.getDouble("num2"),
                    rs.getDouble("resultado"),
                    rs.getTimestamp("fecha")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar historial: " + e.getMessage());
        }

        setVisible(true);
    }
}
