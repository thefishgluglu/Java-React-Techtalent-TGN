package Tarea_4;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	
	public double getDiscriminante() {
		return b * b - 4 * a * c;
	}

	public boolean tieneRaices() {
		return getDiscriminante() > 0;
	}

	public boolean tieneRaiz() {
		return getDiscriminante() == 0;
	}


	public double getRaiz1() {
		return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
	}

	public double getRaiz2() {
		return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	

}
