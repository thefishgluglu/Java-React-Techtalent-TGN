package UD05;

import javax.swing.JOptionPane;

    public class T05_5 {
    	
        public static void main(String[] args) {        	
           
        	String texto_num=JOptionPane.showInputDialog("Introduce tu numero");
           	double numero = Double.parseDouble(texto_num);
            double division= (numero / 2);	
        	JOptionPane.showMessageDialog(null, "El resultado de la divison es: " + division);
        	
        	if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es divisible entre 2.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " NO es divisible entre 2.");
            }
        }
       
        
}