package app.controller;

import app.model.ClienteDAO;
import app.view.ClienteView;
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
                JOptionPane.showMessageDialog(null, "Cliente guardado (simulado)");
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
