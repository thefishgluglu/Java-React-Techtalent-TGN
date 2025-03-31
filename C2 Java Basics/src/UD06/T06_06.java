package UD06;
import javax.swing.JOptionPane;
public class T06_06 {
	
	public static void main(String[] args) {
	
		int num;
		String texto = JOptionPane.showInputDialog("Introduce su numero para saber cuantas cifras tiene");
		num = Integer.parseInt(texto);
		JOptionPane.showMessageDialog(null, "El numero " + num + " tiene " + cifras(num) + " cifras");
			
	}
       public static int cifras(int num) {
    	   	   	int cifras = 0;
	   	while (num > 0) {
	   		num = (int) num / 10;
	   		cifras++;
	   	}
	   	return cifras;
       }
}
