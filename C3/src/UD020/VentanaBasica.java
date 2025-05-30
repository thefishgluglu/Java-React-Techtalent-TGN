package UD020;
import javax.swing.*;

public class VentanaBasica {
    public static void main(String[] args) {
        // Crear la ventana (JFrame)
        JFrame ventana = new JFrame("EJERCICIO 20");

        // Establecer comportamiento al cerrar (salir de la app)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta y agregarla a la ventana
        JLabel etiqueta = new JLabel("EJERCICIO UNIDAD 20 VENTANA", SwingConstants.CENTER);
        ventana.add(etiqueta);

        // Establecer tamaño inicial de la ventana
        ventana.setSize(400, 200);

        // Permitir que el usuario cambie el tamaño
        ventana.setResizable(true);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}