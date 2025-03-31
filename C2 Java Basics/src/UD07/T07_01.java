package UD07;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class T07_01 {

	public static void main(String[] args) {

		HashMap<String, Double> notasAlumnos = new HashMap<>();

		String numnotas = JOptionPane.showInputDialog(null, "Ingrese el número de notas del alumno:");
		int num = Integer.parseInt(numnotas);
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno :");

		for (int i = 0; i < num; i++) {

			String notaStr = JOptionPane.showInputDialog(null, "Ingrese la nota " + i + " del " + nombre + ":");
			double nota = Double.parseDouble(notaStr);
			notasAlumnos.put(nombre, nota);
		}

		double sumaNotas = 0;
		for (double nota : notasAlumnos.values()) {
			sumaNotas += nota;
		}

		double notaMedia = sumaNotas / num ;

		JOptionPane.showMessageDialog(null, "La nota media del alumno es: " + nombre + notaMedia);
	}
}