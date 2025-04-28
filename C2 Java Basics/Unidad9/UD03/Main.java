
package UD03;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setTitulo("Watchmen");
        libro1.setAutor("Alan Moore");
        libro1.setPaginas(416);
        libro1.setISBN("978-1-4012-6902-9");

        Libro libro2 = new Libro();
        libro2.setTitulo("1984");
        libro2.setAutor("George Orwell");
        libro2.setPaginas(328);
        libro2.setISBN("978-0-452-28423-4");

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
}
