package UD09_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Raices raices = new Raices();

          System.out.print("ingresa el valor de a: ");
        raices.setA(scanner.nextDouble());

        System.out.print("ingresa el valor de b: ");
        raices.setB(scanner.nextDouble());

        System.out.print("ingresa el valor de c: ");
        raices.setC(scanner.nextDouble());

              if (raices.tieneRaices()) {
            System.out.println("la equacion tiene dos raices:");
            System.out.println("Raiz 1: " + raices.getRaiz1());
            System.out.println("Raiz 2: " + raices.getRaiz2());
        } else if (raices.tieneRaiz()) {
            System.out.println("la equacion tiene una raiz:");
            System.out.println("Raiz: " + raices.getRaiz1());
        } else {
            System.out.println("La raiz de la equacion no tiene solucion.");
        }

        scanner.close();
    }
}