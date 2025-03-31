
package UD07;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class T07_02 {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        HashMap<String, Double> precios = new HashMap<>();
        final double IVA = 0.21;

        // Fixed prices for each fruit
        precios.put("manzanas", 1.0);
        precios.put("limones", 0.5);
        precios.put("peras", 1.2);
        precios.put("naranjas", 0.8);
        precios.put("platanos", 1.1);
        precios.put("uvas", 2.0);
        precios.put("sandias", 3.0);

        boolean continuar = true;
        while (continuar) {
            String fruta = JOptionPane.showInputDialog("Introduce el nombre de la fruta").toLowerCase();
            if (fruta != null && precios.containsKey(fruta)) {
                String cantidadStr = JOptionPane.showInputDialog("Introduce la cantidad de " + fruta);
                int cantidad = Integer.parseInt(cantidadStr);
                frutas.add(fruta);
                cantidades.add(cantidad);
            } else {
                JOptionPane.showMessageDialog(null, "Fruta no disponible o no válida.");
            }
            String response = JOptionPane.showInputDialog("¿Desea agregar otra fruta? (Si/No)");
            continuar = response != null && response.equalsIgnoreCase("Si");
        }

        System.out.println("Frutas, cantidades y precios con y sin IVA:");
        for (int i = 0; i < frutas.size(); i++) {
            String fruta = frutas.get(i);
            int cantidad = cantidades.get(i);
            int precioSinIVA = (int) (precios.get(fruta) * cantidad);
            double precioConIVA = precioSinIVA * (1 + IVA);
            System.out.println(fruta + ": " + cantidad + " Precio Sin IVA " + precioSinIVA + " $, Precio con IVA: " + precioConIVA);
        }

        String pagar = JOptionPane.showInputDialog("¿Desea pagar? (Si/No)");
        if (pagar.equalsIgnoreCase("Si")) {
            double total = 0;
            for (int i = 0; i < frutas.size(); i++) {
                String fruta = frutas.get(i);
                int cantidad = cantidades.get(i);
                total += precios.get(fruta) * cantidad;
            }
            double totalIVA = total + (total * IVA);

            System.out.println("Total a pagar: " + total + " $, Total con IVA: " + totalIVA + " $");

            String cambioStr = JOptionPane.showInputDialog("El total es " + totalIVA + " Introduce el importe con el que vas a pagar");
            double cambio = Double.parseDouble(cambioStr);
            double cambioFinal = cambio - totalIVA;
			while (cambioFinal < 0) {
				JOptionPane.showMessageDialog(null, "El importe es insuficiente.");
//				System.out.println("El importe es insuficiente.");
//			} return cambioStr;
            System.out.println("Cambio: " + cambioFinal + " $");
        }
    }
}
}


