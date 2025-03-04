package UD05;
import javax.swing.JOptionPane;
    public class T05_10 {
    	
        public static void main(String[] args) {
           
        	  int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventas:"));
              
              double sumaTotal = 0;
              
                  for (int i = 1; i <= numVentas; i++) {
                  double venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la venta " + i + ":"));
                  sumaTotal += venta;
              }
              
              
              JOptionPane.showMessageDialog(null, "La suma total de las ventas es: " + sumaTotal);
          }
    }
    