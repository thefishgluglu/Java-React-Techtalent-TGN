package UD05;

import javax.swing.JOptionPane;

public class T05_11 {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Ingrese el dia:").toLowerCase();
		switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                JOptionPane.showMessageDialog(null, "El dia " + dia + " es laborable");
                break;
            case "sábado":
            case "domingo":
            	default:           	
                JOptionPane.showMessageDialog(null, "El dia " + dia + " no es laborable");
                break;
		 }                
		}
	}
