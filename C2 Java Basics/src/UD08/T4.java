package UD08;

public class T4 {
	
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	private final int TEMPORADAS_DEF = 3;
	private final boolean ENTREGADO_DEF = false;

	
	public T4() {
		this.titulo = "";
		this.nTemporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = "";
	}

	public T4(String nombre, String director) {
		this(); 
		this.titulo = nombre;
		this.creador = director;
	}
	

	public T4(String nombre, int temp, String gendre, String director) {
		this();

		this.titulo = nombre;
		this.nTemporadas = temp;
		this.genero = gendre;
		this.creador = director;

	}
    
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
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

	public int getTEMPORADAS_DEF() {
		return TEMPORADAS_DEF;
	}

	public boolean isENTREGADO_DEF() {
		return ENTREGADO_DEF;
	}
}