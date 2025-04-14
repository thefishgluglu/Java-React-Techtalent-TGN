package UD08;

public class T3 {

	
	private final static double PRECIO_BASE_PRED = 100;
	private final static ColorEnum COLOR_PRED = ColorEnum.BLANCO;
	private final static ConsumoEnum CONSUMO_ENERGETICO_PRED = ConsumoEnum.F;
	private final static double PESO_PRED = 5;

	
	protected double precioBase;
	protected ColorEnum color;
	protected ConsumoEnum consumoEnergetico;
	protected double peso;

	public enum ColorEnum {
		BLANCO, NEGRO, ROJO, AZUL, GRIS 
	}

	public enum ConsumoEnum { 
		A, B, C, D, E, F 
	}

	
	public T3() {
		this.precioBase = PRECIO_BASE_PRED;
		this.color = COLOR_PRED;
		this.consumoEnergetico = CONSUMO_ENERGETICO_PRED;
		this.peso = PESO_PRED;
	}

	public T3(double precio, double peso) {
		this();
		this.precioBase = precio;
		this.peso = peso;
	}

	public T3(double precio, double peso, ColorEnum color, ConsumoEnum consumoEnergetico) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public ColorEnum getColor() {
		return color;
	}

	public void setColor(ColorEnum color) {
		this.color = color;
	}

	public ConsumoEnum getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnum consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static double getPrecioBasePred() {
		return PRECIO_BASE_PRED;
	}

	public static ColorEnum getColorPred() {
		return COLOR_PRED;
	}

	public static ConsumoEnum getConsumoEnergeticoPred() {
		return CONSUMO_ENERGETICO_PRED;
	}

	public static double getPesoPred() {
		return PESO_PRED;
	}
}