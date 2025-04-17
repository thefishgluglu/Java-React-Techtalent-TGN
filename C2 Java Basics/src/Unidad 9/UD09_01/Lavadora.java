
package UD09_01;

public class Lavadora extends Electrodomensticos {

	private static final double CARGA_DEFAULT = 5;

	private double carga;

	public Lavadora() {
		this.precio = precioDefault;
		this.peso = pesoDefault;
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.carga = CARGA_DEFAULT;
	}

	public Lavadora(double precioBase, double peso) {
		this.precio = precioBase;
		this.peso = peso;

		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.carga = CARGA_DEFAULT;
	}

	public Lavadora(double carga, double precioBase, double peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	
	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (carga > 30) {
			precioFinal += 50;
		}

		return precioFinal;
	}

	@Override
	public String toString() {
		return "Precio base: " + precioFinal() + " €\nColor: " + color + "\nConsumo energético: " + consumoEnergetico
				+ "\nPeso: " + peso + " kg" + "\nCarga: " + carga + " kg";
	}
}
