package UD020;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorClicks {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con más interacción");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setLayout(new BorderLayout());

        // Etiqueta para mostrar los contadores
        JLabel label = new JLabel("Boton 1: 0 veces   Boton 2: 0 veces", SwingConstants.CENTER);
        frame.add(label, BorderLayout.NORTH);

        // Panel para botones
        JPanel panelBotones = new JPanel();
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        frame.add(panelBotones, BorderLayout.CENTER);

        // Contadores
        final int[] contador1 = {0};
        final int[] contador2 = {0};

        // Listeners
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador1[0]++;
                label.setText("Boton 1: " + contador1[0] + " veces   Boton 2: " + contador2[0] + " veces");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador2[0]++;
                label.setText("Boton 1: " + contador1[0] + " veces   Boton 2: " + contador2[0] + " veces");
            }
        });

        // Mostrar ventana
        frame.setVisible(true);
    }
}
