package UD03;
public class Libro {
	
	private String titulo;
	private String autor;
	private int paginas;
	private String ISBN;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String toString() {
		return "El libro" + titulo + "con ISBN " + ISBN + 
				"creado por el autor " + autor + " tiene " + paginas + " paginas.";
    }
}
