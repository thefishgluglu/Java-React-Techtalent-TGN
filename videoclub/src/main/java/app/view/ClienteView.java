package app.view;

import javax.swing.*;
import java.awt.*;

public class ClienteView extends JFrame {
    public JTextField txtNombre, txtApellido, txtDireccion, txtDni, txtFecha;
    public JButton btnGuardar, btnListar;

    public ClienteView() {
        setTitle("Gestión de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtDireccion = new JTextField();
        txtDni = new JTextField();
        txtFecha = new JTextField();
        btnGuardar = new JButton("Guardar");
        btnListar = new JButton("Listar");

        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellido:"));
        add(txtApellido);
        add(new JLabel("Dirección:"));
        add(txtDireccion);
        add(new JLabel("DNI:"));
        add(txtDni);
        add(new JLabel("Fecha:"));
        add(txtFecha);
        add(btnGuardar);
        add(btnListar);
    }
}
