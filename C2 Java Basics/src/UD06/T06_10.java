package UD06;

import javax.swing.JOptionPane;

public class T06_10 {
    public static void main(String[] args) {
        String tamaño = JOptionPane.showInputDialog("Inserte el tamaño de la matriz: ");
        int tamañoNum = Integer.parseInt(tamaño);
        int num[] = new int[tamañoNum];
        
        int i = 0;
        int mayor = Integer.MIN_VALUE;
        
        while (i < tamañoNum) {
            num[i] = ValorRandPrimo();
            if (num[i] > mayor) {
                mayor = num[i];
            }
            i++;
        }
        
        System.out.println("El mayor número primo generado es: " + mayor);
    }

    public static int ValorRandPrimo() {
        int Randomnum;
        do {
            Randomnum = (int) (Math.random() * 100);
        } while (Randomnum <= 1 || !esPrimo(Randomnum));
        
        return Randomnum;
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

