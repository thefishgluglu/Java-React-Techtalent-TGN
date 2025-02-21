package UD05;
import javax.swing.JOptionPane;

    public class T05_4 {
    	
        public static void main(String[] args) {        	
           
        	String input=JOptionPane.showInputDialog("Introduce tu radio");
        	double radio = Double.parseDouble(input);
        	double area = Math.PI * Math.pow(radio, 2);
        	
        	JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
        	
        	
        }
       
        
}
        	