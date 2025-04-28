package UD09_01;

import java.util.List;
import java.util.Arrays;

public class Electrodomensticos {
    protected static final List<String> COLORES_DISPONIBLES = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
    protected static final double precioDefault = 100.0;
    protected static final String colorDefault = "blanco";
    protected static final char consumoEnergeticoDefault = 'F';
    protected static final double pesoDefault = 5.0;

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomensticos() {
        this.precio = precioDefault;
        this.color = colorDefault;
        this.consumoEnergetico = consumoEnergeticoDefault;
        this.peso = pesoDefault;
    }

    public Electrodomensticos(double precio, double peso) {
        this();
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomensticos(double precio, double peso, String color, char consumoEnergetico) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = consumoEnergeticoDefault;
        }
    }

    private void comprobarColor(String color) {
        if (COLORES_DISPONIBLES.contains(color.toLowerCase())) {
            this.color = color.toLowerCase();
        } else {
            this.color = colorDefault;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double precioFinal() {
        // Placeholder for price calculation logic
        return precio;
    }

    @Override
    public String toString() {
        return "Precio: " + precio + " €\nColor: " + color
                + "\nConsumo energético: " + consumoEnergetico
                + "\nPeso: " + peso + " kg";
    }
}
