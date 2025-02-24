package UD05;
import javax.swing.JOptionPane;

public class T05_12 {

	public static void main(String[] args) {
		
		String password ="1234";
		String pass = "";
		int intentos = 3;
		while (intentos > 0) {
			pass = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (pass.equals(password)) {
				JOptionPane.showMessageDialog(null, "Contraseña correcta");
				return;
			} else {
				intentos--;
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Te quedan " + intentos + " intentos");
			
			}
		}

	}
}
		