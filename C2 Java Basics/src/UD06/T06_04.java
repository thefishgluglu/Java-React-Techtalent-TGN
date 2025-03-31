package UD06;

import javax.swing.JOptionPane;

public class T06_04 {
	public static void main(String[] args) {
		int numero = 0;

		String texto = JOptionPane.showInputDialog("Introduce su numero factorial");
		numero = Integer.parseInt(texto);

		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial(numero));
	}

	public static int factorial(int numero) {
		for (int i = numero - 1; i > 0; i--) {
			numero *= i;
		}
		return numero;
	}
}
