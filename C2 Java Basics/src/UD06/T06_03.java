
package UD06;

import javax.swing.JOptionPane;

public class T06_03 {
    public static void main(String[] args) {

        long num;
        do {
            String texto = JOptionPane.showInputDialog("Introduce un número superior a 1");
            num = Long.parseLong(texto);
        } while (num <= 1);

        long contadores = 0;
        for (long i = 1; i <= num; i++) {
            if (num % i == 0) {
                contadores++;
            }
        }
        System.out.println(contadores);
        boolean mensaje = positivos(contadores);
        System.out.println(mensaje);
    }

    public static boolean positivos(long contadores) {
        if (contadores < 3) {
            return true;
        } else {
            return false;
        }
    }
}

