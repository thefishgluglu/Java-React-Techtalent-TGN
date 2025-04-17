package UD09_02;

public class Serie {
	protected String titulo;
	protected int numeroTemporadas = 3;
	protected boolean entregado = false;
	protected String genero;
	protected String creador;
	
	
	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void entregar() {
		this.entregado = true;
			
		
	}

	public void devolver() {
		this.entregado = false;
		
		
	}

	public String compareTo(Serie s2) {
		if (this.numeroTemporadas > s2.numeroTemporadas) {
			return this.titulo + " tiene más temporadas que " + s2.titulo;
		} else if (this.numeroTemporadas < s2.numeroTemporadas) {
			return this.titulo + " tiene menos temporadas que " + s2.titulo;
		} else {
			return this.titulo + " y " + s2.titulo + " tienen el mismo número de temporadas";
		
		
		return null;
	}
} 
}
