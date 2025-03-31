package UD06;
import javax.swing.JOptionPane;
public class T06_07 {
	public static void main(String[] args) {

String input=JOptionPane.showInputDialog("introduce la divisa a la que quieres convertir");
if (input.equals("libras")) {
	libras();
	} else if (input.equals("dolares")) {
		dolares();
		} else if (input.equals("yenes")) {
			yenes();
			} else {
				JOptionPane.showMessageDialog(null, "La divisa no es correcta inserte: libras, dolares, yenes");
				}
}
	 private static void libras() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a euros:"));
		JOptionPane.showMessageDialog(null, "la conversion de" + valor + "euros a libras es:" + valor * 0.86);
	}
	 private static void dolares() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a euros:"));
		JOptionPane.showMessageDialog(null, "la conversion de" + valor + "euros a libras es:" + valor * 1.28611);
	}
	private static void yenes() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a euros:"));
		JOptionPane.showMessageDialog(null, "la conversion de" + valor + "euros a libras es:" + valor * 129.852);
	}

}
