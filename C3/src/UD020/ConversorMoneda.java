package UD020;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorMoneda {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora cambio de monedas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Componentes
        JLabel labelCantidad = new JLabel("Cantidad a convertir");
        JTextField campoCantidad = new JTextField(10);

        JLabel labelResultado = new JLabel("Resultado");
        JTextField campoResultado = new JTextField(10);
        campoResultado.setEditable(false);

        JButton btnConvertir = new JButton("Cambiar");
        JButton btnBorrar = new JButton("Borrar");

        // Conversión Pesetas a Euros (1€ = 166.386 ptas)
        double tasaCambio = 166.386;

        // Acción del botón Cambiar
        btnConvertir.addActionListener(e -> {
            try {
                double cantidad = Double.parseDouble(campoCantidad.getText());
                double resultado = cantidad / tasaCambio;
                campoResultado.setText(String.format("%.2f", resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Por favor, introduce un número válido.",
                        "Error de formato",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Acción del botón Borrar
        btnBorrar.addActionListener(e -> {
            campoCantidad.setText("");
            campoResultado.setText("");
        });

        // Tecla Enter activa el botón Cambiar
        campoCantidad.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnConvertir.doClick();
                }
            }
        });

        // Añadir componentes
        frame.add(labelCantidad);
        frame.add(campoCantidad);
        frame.add(labelResultado);
        frame.add(campoResultado);
        frame.add(btnConvertir);
        frame.add(btnBorrar);

        frame.setVisible(true);
    }
}
