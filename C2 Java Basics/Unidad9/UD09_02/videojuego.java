package UD09_02;

public class videojuego {
	protected String titulo;
	protected int horasEstimadas = 10;
	protected boolean entregado = false;
	protected String genero;
	protected String compania;
	
	public videojuego() {
		this.titulo = "";
		this.genero = "";
		this.compania = "";
	}
	
	public videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public void entregar() {
		this.entregado = true;
    }

	public void devolver() {
		this.entregado = false;
    }

	public String compareTo(videojuego v2) {
		if (this.horasEstimadas > v2.horasEstimadas) {
            return this.titulo + " es mayor que " + v2.titulo;
        } else if (this.horasEstimadas < v2.horasEstimadas) {
            return this.titulo + " es menor que " + v2.titulo;
        } else {
            return this.titulo + " es igual que " + v2.titulo;
        }
		
		
	}
		
		
	
		
		
	}
	


