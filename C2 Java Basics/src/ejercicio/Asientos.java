package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Asientos {
    private JFrame frame;
    private JButton[][] asientos;

    public void crearSala() {
        frame = new JFrame("Sala de Cine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JPanel panelAsientos = new JPanel(new GridLayout(9, 10));
        asientos = new JButton[9][10];

        ImageIcon iconoDisponible = new ImageIcon("src/imagenes/asiento_disponible.png");
        ImageIcon iconoOcupado = new ImageIcon("src/imagenes/asiento_ocupado.png");

        // Redimensionar imágenes
        iconoDisponible = new ImageIcon(iconoDisponible.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        iconoOcupado = new ImageIcon(iconoOcupado.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                JButton boton = new JButton(iconoDisponible);
                asientos[i][j] = boton;

                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (boton.getIcon().equals(iconoDisponible)) {
                            boton.setIcon(iconoOcupado);
                        } else {
                            JOptionPane.showMessageDialog(frame, "Este asiento ya está ocupado.");
                        }
                    }
                });

                panelAsientos.add(boton);
            }
        }

        JButton resetButton = new JButton("Resetear Sala");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 10; j++) {
                        asientos[i][j].setIcon(iconoDisponible);
                    }
                }
            }
        });

        frame.add(panelAsientos, BorderLayout.CENTER);
        frame.add(resetButton, BorderLayout.SOUTH);

        // Hacer visible el frame después de añadir todos los componentes
        frame.setVisible(true);
    }
}

