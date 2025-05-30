package geometria;

public class Geometria {

    public int areaCuadrado(int lado) {
        return lado * lado;
    }

    public double areaCirculo(int radio) {
        return Math.PI * radio * radio;
    }

    public double areaTriangulo(int base, int altura) {
        return (base * altura) / 2.0;
    }

    public int areaRectangulo(int base, int altura) {
        return base * altura;
    }

    public double areaPentagono(int perimetro, int apotema) {
        return (perimetro * apotema) / 2.0;
    }
}
