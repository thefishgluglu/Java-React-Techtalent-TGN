package EXERCICIS_EXTRES;

import javax.swing.JOptionPane;

public class Nº1 {
	public static void main(String[] args) {
		int num;
		String mensaje = "";
		do {
			String texto = JOptionPane.showInputDialog("Introduce un número superior a 1");
			num = Integer.parseInt(texto);
		} while (num <= 1);
		
		int contadores = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contadores++;
				if (contadores < 3) {
					mensaje = "El número " + num + " es primo";
				} else {
					mensaje = "El número " + num + " no es primo";
				}
			}
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
