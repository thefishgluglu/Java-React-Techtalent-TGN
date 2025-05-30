package UD019;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class extends JFrame {
	    private JTextField campoTexto;
	    private JButton botonMostrar;

	    public FormularioTexto() {
	        setTitle("Ejercicio 1 - UD19");
	        setSize(400, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        JLabel etiqueta = new JLabel("Introduce un texto:");
	        campoTexto = new JTextField(20);
	        botonMostrar = new JButton("Mostrar");

	        // Evento al hacer clic en el botón
	        botonMostrar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String texto = campoTexto.getText();
	                JOptionPane.showMessageDialog(null, "Texto ingresado: " + texto);
	            }
	        });

	        add(etiqueta);
	        add(campoTexto);
	        add(botonMostrar);
	    }
	    public static void main(String[] args) {
	        FormularioTexto ventana = new FormularioTexto();
	        ventana.setVisible(true);
	    }

	    
	}

