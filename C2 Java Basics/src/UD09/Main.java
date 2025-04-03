

package UD09;

import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] movieTitles = {"Torrente", "Avatar", "Titanic", "Ready Player 1", "El resplandor"};
        String[] directors = {"Director1", "Director2", "Director3", "Director4", "Director5"};

        String selectedMovieTitle = (String) JOptionPane.showInputDialog(
                null,
                "Select a movie to watch:",
                "Movie Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                movieTitles,
                movieTitles[0]
        );

        if (selectedMovieTitle == null) {
            System.out.println("No movie selected. Exiting.");
            return;
		} else if (selectedMovieTitle == "Torrente") {
			Movie movie = new Movie("Torrente", 120, 18, "Santiago Segura");
			JOptionPane.showMessageDialog(null,
					"nombre de pelicula: " + movie.getTitle() + "\n" + "duracion: " + movie.getDuration() + "\n"
							+ "edad minima: " + movie.getMinAge() + "\n" + "director: " + movie.getDirector());
			return;
		}

        Random random = new Random();
        Movie movie = new Movie(
                selectedMovieTitle,
                60 + random.nextInt(121),
                12 + random.nextInt(7),
                directors[random.nextInt(directors.length)]
        );

        double ticketPrice = 5 + random.nextInt(6);
        Cinema cinema = new Cinema(movie, ticketPrice);

        for (int i = 0; i < 100; i++) {
            Spectator spectator = new Spectator(
                    "Spectator" + (i + 1),
                    10 + random.nextInt(50),
                    5 + random.nextInt(16)
            );
            cinema.seatSpectator(spectator);
        }

        cinema.printSeats();
    }
}
