
package UD07;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class To7_03 {
    public static void main(String[] args) {
        HashMap<String, Double> precios = precios();
        HashMap<String, Integer> stock = stock();
        final double IVA = 0.21;

        boolean continuar = true;
        while (continuar) {
            String[] options = {"Añadir Producto", "Consultar Producto", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de Productos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0: // Añadir Producto
                    String nuevoProducto = JOptionPane.showInputDialog("Introduce el nombre del nuevo producto").toLowerCase();
                    String precioStr = JOptionPane.showInputDialog("Introduce el precio de " + nuevoProducto);
                    double precio = Double.parseDouble(precioStr);
                    String cantidadStr = JOptionPane.showInputDialog("Introduce la cantidad de " + nuevoProducto);
                    int cantidad = Integer.parseInt(cantidadStr);

                    precios.put(nuevoProducto, precio);
                    stock.put(nuevoProducto, cantidad);
                    JOptionPane.showMessageDialog(null, "Producto añadido correctamente.");
                    break;

                case 1: // Consultar Producto
                    String productoConsulta = JOptionPane.showInputDialog("Introduce el nombre del producto a consultar").toLowerCase();
                    if (precios.containsKey(productoConsulta) && stock.containsKey(productoConsulta)) {
                        double precioConsulta = precios.get(productoConsulta);
                        int cantidadConsulta = stock.get(productoConsulta);
                        JOptionPane.showMessageDialog(null, "Producto: " + productoConsulta + "\nPrecio: " + precioConsulta + "\nCantidad: " + cantidadConsulta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    }
                    break;

                case 2: // Salir
                    continuar = false;
                    break;

                default:
                    break;
            }
        }
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

