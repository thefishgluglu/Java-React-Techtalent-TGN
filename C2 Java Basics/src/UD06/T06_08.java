
package UD06;

import javax.swing.JOptionPane;

public class T06_08 {
	public static void main(String[] args) {
		int array[] = new int[10];
		System.out.println("Array 1");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		}
		
		System.out.println("Numeros introducidos");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
