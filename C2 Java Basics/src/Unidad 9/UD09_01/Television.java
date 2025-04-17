package UD09_01;

public class Television extends Electrodomensticos {
	
	private static final double RESOLUCION_DEFAULT = 20;
	private static final boolean SINTONIZADOR_TDT_DEFAULT = false;
	private static final double PORCENTAJE_INCREMENTO_RESOLUCION = 0.3;
	private static final double PRECIO_INCREMENTO_SINTONIZADOR_TDT = 50;

	
	private double resolucion;
	private boolean sintonizadorTDT;


	public Television() {
		this.precio = precioDefault;
		this.peso = pesoDefault;
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.resolucion = RESOLUCION_DEFAULT;
		
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
	}

	public Television(double precioBase, double peso) {

		this.precio = precioBase;
		this.peso = peso;
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;

	}

	public Television(double resolucion, boolean sintonizadorTDT, double precioBase, 
							double peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	
	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() { 
		return sintonizadorTDT;
	}


	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (resolucion > 40) {
			precioFinal *= (1 + PORCENTAJE_INCREMENTO_RESOLUCION);

		}

		if (sintonizadorTDT) {
			precioFinal += PRECIO_INCREMENTO_SINTONIZADOR_TDT;
		}

		return precioFinal;
	}
	
	@Override
	public String toString() {
		return "Precio base: " + precio + " €\nColor: " + color 
				+ "\nConsumo energético: " + consumoEnergetico
				+ "\nPeso: " + peso + " kg"
				+ "\nResolucion: " + resolucion + " pulgadas"
				+ "\nTDT: " + sintonizadorTDT;
	}

}