package UD05;

import javax.swing.JOptionPane;
public class T05_2 {
	public static void main(String[] args){
		
	
	String nombre = "Fernando";
	System.out.println("--Bienvenido--");
	System.out.println("Daniel");
	
	nombre = JOptionPane.showInputDialog("Introduce tu nombre");
	JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);  
	 
	
	}	
}
