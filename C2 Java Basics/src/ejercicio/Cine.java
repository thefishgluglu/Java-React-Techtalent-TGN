package ejercicio;
import javax.swing.*;

public class Cine {
    private Pelicula[] peliculas;
    private Asientos asientos;

    public Cine() {
        peliculas = new Pelicula[] {
            new Pelicula("Torrente", "Santiago Segura", 90, 18),
            new Pelicula("Avatar", "James Cameron", 160, 12),
            new Pelicula("Titanic", "James Cameron", 195, 13),
            new Pelicula("Ready Player One", "Spielberg", 140, 12),
            new Pelicula("El Resplandor", "Kubrick", 120, 18)
        };
        asientos = new Asientos();
    }

    public void iniciar() {
        String[] nombres = new String[peliculas.length];
        for (int i = 0; i < peliculas.length; i++) {
            nombres[i] = peliculas[i].getTitulo();
        }

        String seleccion = (String) JOptionPane.showInputDialog(null, "Elige una película", "Cine", JOptionPane.QUESTION_MESSAGE, null, nombres, nombres[0]);

        Pelicula peliSeleccionada = null;
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equals(seleccion)) {
                peliSeleccionada = p;
                break;
            }
        }

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

        if (edad >= peliSeleccionada.getEdadMinima()) {
            JOptionPane.showMessageDialog(null, "Título: " + peliSeleccionada.getTitulo() + "\nDirector: " + peliSeleccionada.getDirector() + "\nDuración: " + peliSeleccionada.getDuracion() + " minutos\nEdad mínima: " + peliSeleccionada.getEdadMinima());

          asientos.mostrarAsientos();
        } else {
            JOptionPane.showMessageDialog(null, "No tienes la edad suficiente para ver esta película");
        }
    }
}
