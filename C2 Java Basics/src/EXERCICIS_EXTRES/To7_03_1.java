
package EXERCICIS_EXTRES;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class To7_03_1 {
    public static void main(String[] args) {
        HashMap<String, Double> precios = precios();
        HashMap<String, Integer> stock = new HashMap<>();
        HashMap<String, Double> cesta = new HashMap<>();
        final double IVA = 0.21;
        boolean continuar = true;
        while (continuar) {
            String inicio = (String) JOptionPane.showInputDialog(null, "Introduce si quiere \n1.añadir producto \n2.consultar de productos \n3.salir ");
            switch (inicio) {
                case "añadir producto":
                    String nuevoProducto = JOptionPane.showInputDialog("Introduce el nombre del nuevo producto").toLowerCase();
                    String precioStr = JOptionPane.showInputDialog("Introduce el precio de " + nuevoProducto);
                    double precio = Double.parseDouble(precioStr);
                    String cantidadStr = JOptionPane.showInputDialog("Introduce la cantidad de " + nuevoProducto);
                    int cantidad = Integer.parseInt(cantidadStr);

                    precios.put(nuevoProducto, precio);
                    stock.put(nuevoProducto, cantidad);
                    JOptionPane.showMessageDialog(null, "Producto añadido correctamente.");
                    break;

                case "consultar producto":
                    String productoConsulta = JOptionPane.showInputDialog("Introduce el nombre del producto a consultar").toLowerCase();
                    if (precios.containsKey(productoConsulta) && stock.containsKey(productoConsulta)) {
                        double precioConsulta = precios.get(productoConsulta);
                        int cantidadConsulta = stock.get(productoConsulta);
                        JOptionPane.showMessageDialog(null, "Producto: " + productoConsulta + "\nPrecio: " + precioConsulta + "\nCantidad: " + cantidadConsulta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    }
                    break;

                case "salir":
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        }
        double precioManzanas = precios.get("manzanas");
        double totalSinIVA = precioManzanas * cesta.get("manzanas");
        double totalConIVA = totalSinIVA * (1 + IVA);

        System.out.println("Total sin IVA: " + totalSinIVA);
        System.out.println("Total con IVA: " + totalConIVA);
    }

    private static HashMap<String, Double> precios() {
        HashMap<String, Double> precios = new HashMap<>();
        precios.put("manzanas", 1.0);
        precios.put("limones", 0.5);
        precios.put("peras", 1.2);
        precios.put("naranjas", 0.8);
        precios.put("platanos", 1.1);
        precios.put("uvas", 2.0);
        precios.put("sandias", 3.0);
        precios.put("patatas", 0.5);
        precios.put("pizza", 3.5);
        precios.put("agua", 0.5);
        return precios;
    }

    private static HashMap<String, Integer> stock() {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("manzanas", 10);
        stock.put("limones", 10);
        stock.put("peras", 10);
        stock.put("naranjas", 10);
        stock.put("platanos", 10);
        stock.put("uvas", 10);
        stock.put("sandias", 10);
        stock.put("patatas", 10);
        stock.put("pizza", 10);
        stock.put("agua", 10);
        return stock;
    }
}



