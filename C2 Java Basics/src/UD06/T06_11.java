
package UD06;

import javax.swing.JOptionPane;

public class T06_11 {

  public static void main(String[] args) {
    // Solicita al usuario el número de filas y columnas para la matriz
    String Filas = JOptionPane.showInputDialog("Inserte el numero de filas de la matriz: ");
    String Columnas = JOptionPane.showInputDialog("Inserte el numero de columnas de la matriz: ");

    // Inicializa dos matrices con las dimensiones especificadas por el usuario
    int array[][] = new int[Integer.parseInt(Filas)][Integer.parseInt(Columnas)];
    int array2[][] = new int[Integer.parseInt(Filas)][Integer.parseInt(Columnas)];

    // Llena la primera matriz con valores aleatorios
    int i = 0;
    while (i < Integer.parseInt(Filas)) {
      int j = 0;
      while (j < Integer.parseInt(Columnas)) {
        array[i][j] = ValorRand();
        j++;
      }
      i++;
    }

    // Copia los valores de la primera matriz a la segunda
    array2 = array;

    // Muestra los valores de la primera matriz
    System.out.println("Array 1");
    Mostrar(array, array.length, array[0].length);

    // Muestra los valores de la segunda matriz
    System.out.println("Array 2");
    Mostrar(array2, array2.length, array2[0].length);

    // Inicializa una tercera matriz para almacenar el resultado de la multiplicación
    int[][] array3 = new int[Integer.parseInt(Filas)][Integer.parseInt(Columnas)];
    System.out.println("Array 3");

    // Multiplica los valores de las dos primeras matrices y almacena el resultado en la tercera
    array3 = multipliArrays(array, array2, array3, array.length, array[0].length);
  }

  // Genera un número aleatorio entre 0 y 9
  public static int ValorRand() {
    int RandomNum = (int) (Math.random() * 10);
    return RandomNum;
  }

  // Muestra los valores de una matriz
  public static int Mostrar(int[][] num, int Longitud, int Longitud2) {
    for (int i = 0; i < Longitud; i++) {
      for (int j = 0; j < Longitud2; j++) {
        System.out.println("El valor de num[" + i + "][" + j + "] es " + num[i][j]);
      }
    }
    return 0;
  }

  // Multiplica los valores de dos matrices y almacena el resultado en una tercera matriz
  public static int[][] multipliArrays(int Array1[][], int Array2[][], int Array3[][], int Filas, int Columnas) {
    for (int i = 0; i < Filas; i++) {
      for (int j = 0; j < Columnas; j++) {
        Array3[i][j] = Array1[i][j] * Array2[i][j];
        System.out.println("El valor de num[" + i + "][" + j + "] es " + Array3[i][j]);
      }
    }
    return Array3;
  }
}

		