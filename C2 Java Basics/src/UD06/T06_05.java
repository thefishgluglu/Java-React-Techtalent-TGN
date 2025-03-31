package UD06;
import javax.swing.JOptionPane;
public class T06_05 {
	public static void main(String[] args) {
		int num;
		String texto = JOptionPane.showInputDialog("Introduce su numero para pasar a binario");
		num = Integer.parseInt(texto);
		JOptionPane.showMessageDialog(null, "El numero " + num + " en binario es " + binario(num));
	}
        public static String binario(int num) {
        	String binario = "";
        	while (num > 0) {
				if (num % 2 == 0) {
					binario = "0" + binario;
				} else {
					binario = "1" + binario;
				}
				num = (int) num / 2;
			}  return binario;
        }   
}
