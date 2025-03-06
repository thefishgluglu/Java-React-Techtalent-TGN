package UD06;
import javax.swing.JOptionPane;
public class T06_12 {	


		public static void main(String[] args) {
			String Filas = JOptionPane.showInputDialog("Inserte el numero de filas de la matriz: ");
			String Columnas = JOptionPane.showInputDialog("Inserte el numero de columnas de la matriz: ");
			String cifra = JOptionPane.showInputDialog("Inserte la cifra final deseada: ");

			int array[][] = new int[Integer.parseInt(Filas)][Integer.parseInt(Columnas)];
			int i = 0;
			while (i < Integer.parseInt(Filas)) {
				int j = 0;
				while (j < Integer.parseInt(Columnas)) {
					array[i][j] = ValorRand();
					j++;
				}
				i++;
			}
			System.out.println("Array 1");
			mostrar(array, array.length, array[0].length, Integer.parseInt(cifra));
			
		}public static int ValorRand() {
			int RandomNum = (int) (Math.random() * 300);
			return RandomNum;
		
	}
//		public static int Mostrar(int[][] num, int Longitud, int Longitud2) {
//		    for (int i = 0; i < Longitud; i++) {
//		        for (int j = 0; j < Longitud2; j++) {
//		            System.out.println("El valor de num[" + i + "][" + j + "] es " + num[i][j]);
//		        }
//		    }
//		    return 0;
//		}
		public static void mostrar(int[][] num, int longitud, int longitud2, int cifra) {
	        for (int i = 0; i < longitud; i++) {
	            for (int j = 0; j < longitud2; j++) {
	                if (num[i][j] % 10 == cifra) {
	                    System.out.println("El valor de num[" + i + "][" + j + "] es " + num[i][j]);
	                }
	            }
	        }
	    }
  }

