package UD06;
import javax.swing.JOptionPane;
public class T06_02 {
	public static void main(String[] args) {
//		Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
//		nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
//		que números queremos que los genere, podemos pedirlas por teclado antes de generar los
//		números. Este método devolverá un número entero aleatorio. Muestra estos números por
//		pantalla.

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos numeros random quiere generar: "));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo: "));
		for (int i = 0; i < num; i++) {
			System.out.println("Número entero aleatorio: " + (int)(Math.random()*(max-min+1)+min));
			
		}
	}
}


