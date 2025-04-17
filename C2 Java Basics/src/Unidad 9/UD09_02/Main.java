package UD09_02;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		videojuego v1 = new videojuego("The Last of Us", 15, "Acción", "Naughty Dog");
		videojuego v2 = new videojuego("God of War", 20, "Acción/Aventura", "Santa Monica Studio");

		Serie s1 = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		Serie s2 = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff y D.B. Weiss");

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(s1);
		System.out.println(s2);

		v1.entregar();
		s1.entregar();

		System.out.println("Entregados:");
		System.out.println(v1);
		System.out.println(s1);

		v1.devolver();
		s1.devolver();

		System.out.println("Devoluciones:");
		System.out.println(v1);
		System.out.println(s1);

		System.out.println("Comparación de videojuegos: " + v1.compareTo(v2));
		System.out.println("Comparación de series: " + s1.compareTo(s2));

	}

}
