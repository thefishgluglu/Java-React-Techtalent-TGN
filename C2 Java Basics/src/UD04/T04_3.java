package UD04;

public class T04_3 {
    public static void main(String[] args) {
        
        int X = 5, Y = 10;
        double N = 15.0, M = 20.0;
        
        System.out.println("Valor de X: " + X);
        System.out.println("Valor de Y: " + Y);
        System.out.println("Valor de N: " + N);
        System.out.println("Valor de M: " + M);
        System.out.println("Suma X + Y: 5 + 10= " + (X + Y));
        System.out.println("Diferencia X - Y: 5 - 10= " + (X - Y));
        System.out.println("Producto X * Y: 5 x 10= " + (X * Y));
        System.out.println("Cociente X / Y: 5 / 10= " + ((double) X / Y));
        System.out.println("Resto X % Y: 5 % 10= " + (X % Y));
        System.out.println("Suma N + M: 15 + 20= " + (N + M));
        System.out.println("Diferencia N - M: 15 - 20=" + (N - M));
        System.out.println("Producto N * M: 15 x 20= " + (N * M));
        System.out.println("Cociente N / M: 15/ 20=" + (N / M));
        System.out.println("Resto N % M: 15 % 20= " + (N % M));
        System.out.println("Suma X + N: 5 + 15= " + (X + N));
        System.out.println("Cociente Y / M: 10 / 20= " + (Y / M));
        System.out.println("Resto Y % M: 10 % M= " + (Y % M));
        System.out.println("Doble de X: 5 x 2= " + (X * 2));
        System.out.println("Doble de Y: 10 x 2= " + (Y * 2));
        System.out.println("Doble de N: 15 x 2= " + (N * 2));
        System.out.println("Doble de M: 20 x 2= " + (M * 2));  
        System.out.println("Suma de todas las variables: 5 + 10 + 15 + 20= " + (X + Y + N + M));
        System.out.println("Producto de todas las variables: 5 x 10 x 15 x 20= " + (X * Y * N * M));
    }
}