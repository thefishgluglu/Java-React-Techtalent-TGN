package UD06;

import javax.swing.JOptionPane;

public class T06_03 {
	public static void main(String[] args) {

		int num;
		do {
			String texto = JOptionPane.showInputDialog("Introduce un número superior a 1");
			num = Integer.parseInt(texto);
		} while (num <= 1);

		int contadores = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contadores++;
			}
		}
		System.out.println(contadores);
		boolean mensaje = positivos(contadores);
		System.out.println(mensaje);

	}

	public static boolean positivos(int contadores) {

		if (contadores < 3) {
			return true;
		} else {
			return false;
		}

	}
}
