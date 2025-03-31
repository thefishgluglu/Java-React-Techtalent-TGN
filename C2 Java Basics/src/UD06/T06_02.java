package UD06;
import javax.swing.JOptionPane;
public class T06_02 {
	public static void main(String[] args) {


		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos numeros random quiere generar: "));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo: "));
		for (int i = 0; i < num; i++) {
			System.out.println("Número entero aleatorio: " + (int)(Math.random()*(max-min+1)+min));
			
		}
	}
}


