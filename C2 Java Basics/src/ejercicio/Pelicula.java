package ejercicio;
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, String director, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}
