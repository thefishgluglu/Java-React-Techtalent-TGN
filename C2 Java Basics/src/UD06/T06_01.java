package UD06;

import javax.swing.JOptionPane;

public class T06_01 {
	
	public static void main(String[] args) {        	
        
    	String input=JOptionPane.showInputDialog("introduce tu figura (	cuadrado, circulo, triangulo)");
    	if (input.equals("cuadrado")) {
			cuadrado();
			} else if (input.equals("circulo")) {
				circulo();
				} else if (input.equals("triangulo")) {
					triangulo();
					} else {
						JOptionPane.showMessageDialog(null, "La figura no es correcta");
						}
	}
        	 private static void cuadrado() {
        		double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado de la figura:"));
        		JOptionPane.showMessageDialog(null, "el area del caudrado es:" + (lado * lado));
        	}
        	 private static void circulo() {
        		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la figura:"));
        		JOptionPane.showMessageDialog(null, "el area del circulo es:" + (Math.PI * Math.pow(radio, 2)));
        	}
        	private static void triangulo() {
        		double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base de la figura:"));
        		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la figura:"));
        		JOptionPane.showMessageDialog(null, "el area del caudrado es:" + (base* altura)/2);
        	}
	 
}

    	  	
    	  	       
    	  	 
    	 