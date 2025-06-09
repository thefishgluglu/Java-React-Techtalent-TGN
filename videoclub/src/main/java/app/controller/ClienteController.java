package app.controller;

import app.model.Cliente;
import app.model.ClienteDAO;
import app.view.ClienteView;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteController {
    ClienteView vista;
    ClienteDAO dao;

    public ClienteController(ClienteView vista, ClienteDAO dao) {
        this.vista = vista;
        this.dao = dao;

        vista.btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente c = new Cliente();
                c.setNombre(vista.txtNombre.getText());
                c.setApellido(vista.txtApellido.getText());
                c.setDireccion(vista.txtDireccion.getText());
                c.setDni(vista.txtDni.getText());
                try {
                    String input = vista.txtFecha.getText(); // "23/10/2010"
                    SimpleDateFormat entrada = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat salida = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaParseada = entrada.parse(input);
                    String fechaFormateada = salida.format(fechaParseada);
                    c.setFecha(fechaFormateada);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Fecha inválida. Usa formato dd/MM/yyyy");
                    return;
                }

                dao.insertarCliente(c);
                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente.");
            }
        });

        vista.btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dao.obtenerClientes().forEach(cliente ->
                    System.out.println(cliente.getNombre() + " " + cliente.getApellido())
                );
            }
        });

        vista.setVisible(true);
    }
}
