package UD05;
import javax.swing.JOptionPane;

    public class T05_6 {
    	
        public static void main(String[] args) {        	
           
        	final double IVA=0.21;
        	String texto_num=JOptionPane.showInputDialog("Introduce tu numero");
        	double precio= Double.parseDouble(texto_num);
        	
            JOptionPane.showMessageDialog(null,"el producto final tiene un precio de" + (precio+ (precio*IVA)));
        }
        
    }