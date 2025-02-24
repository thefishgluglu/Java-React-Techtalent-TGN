package UD05;

import javax.swing.JOptionPane;

public class T05_13 {
	public static void main(String[] args) {
        
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer operador:"));
        
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo operador:"));
        
        String operacion = JOptionPane.showInputDialog("Ingrese la operación a realizar (+, -, *, /,^,%):");
        
		switch (operacion) {
		case "+":
			JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (num1 + num2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (num1 - num2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + (num1 * num2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "El resultado de la división es: " + (num1 / num2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, "El resultado de la potencia es: " + Math.pow(num1, num2));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "El resultado del módulo es: " + (num1 % num2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operación no válida");
		}
	}
}