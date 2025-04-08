
package UD09;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<String> occupiedSeats = new ArrayList<>();
    private static ArrayList<String> selectedSeats = new ArrayList<>();
    private static final String FILE_NAME = "occupiedSeats.txt";

    public static void main(String[] args) {
        loadOccupiedSeats();

        String[] movieTitles = {"Torrente", "Avatar", "Titanic", "Ready Player One", "El resplandor"};

        String selectedMovieTitle = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una película:",
                "Selección de película",
                JOptionPane.QUESTION_MESSAGE,
                null,
                movieTitles,
                movieTitles[0]
        );

        if (selectedMovieTitle == null) {
            System.out.println("No se seleccionó película. Saliendo...");
            return;
        }

        Movie movie = null;
        switch (selectedMovieTitle) {
            case "Torrente":
                movie = new Movie("Torrente", 120, 18, "Santiago Segura");
                break;
            case "Avatar":
                movie = new Movie("Avatar", 150, 12, "James Cameron");
                break;
            case "Titanic":
                movie = new Movie("Titanic", 195, 12, "James Cameron");
                break;
            case "Ready Player One":
                movie = new Movie("Ready Player One", 140, 12, "Steven Spielberg");
                break;
            case "El resplandor":
                movie = new Movie("El resplandor", 144, 18, "Stanley Kubrick");
                break;
        }

        if (movie != null) {
            String ageInput = JOptionPane.showInputDialog("Ingrese su edad para la película:");
            int age = Integer.parseInt(ageInput);

            if (age < movie.getMinAge()) {
                JOptionPane.showMessageDialog(null, "Eres demasiado joven para ver la película.");
                return;
            }

            JFrame frame = new JFrame("Selección de Asientos - " + movie.getTitle());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new GridLayout(9, 10));

            String[] rows = {"8", "7", "6", "5", "4", "3", "2", "1"};
            String[] columns = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

            for (String row : rows) {
                for (String column : columns) {
                    String seat = row + column;

                    JButton button = new JButton();

                    int rowNumber = Integer.parseInt(row);

                    if (occupiedSeats.contains(seat)) {
                        button.setIcon(resizeIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Java-React-Techtalent-TGN\\C2 Java Basics\\src\\imagenes\\asiento ocupado.png"), 40, 40));
                        button.setEnabled(false);
                    } else {
                        if (rowNumber == 4 || rowNumber == 5 || rowNumber == 6) {
                            button.setIcon(resizeIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Java-React-Techtalent-TGN\\C2 Java Basics\\src\\imagenes\\asiento disponible.png"), 40, 40));
                        } else {
                            button.setIcon(resizeIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Java-React-Techtalent-TGN\\C2 Java Basics\\src\\imagenes\\asiento ocupado.png"), 40, 40));
                        }
                    }

                    // Color de fondo según VIP o normal (opcional)
                    if (rowNumber == 4 || rowNumber == 5 || rowNumber == 6) {
                        button.setBackground(new Color(255, 182, 193));
                    } else {
                        button.setBackground(new Color(173, 216, 230));
                    }

                    // ActionListener para agregar el asiento seleccionado
                    button.addActionListener(e -> {
                        double price = (rowNumber == 4 || rowNumber == 5 || rowNumber == 6) ? 10.0 : 8.0;

                        if (selectedSeats.contains(seat)) {
                            selectedSeats.remove(seat);
                            button.setBackground(rowNumber == 4 || rowNumber == 5 || rowNumber == 6 ? new Color(255, 182, 193) : new Color(173, 216, 230));
                        } else {
                            selectedSeats.add(seat);
                            button.setBackground(Color.GREEN);
                        }
                    });

                    frame.add(button);
                }
            }

            JButton confirmButton = new JButton("Comprar Entradas");
            confirmButton.addActionListener(e -> {
                double totalPrice = 0.0;
                for (String seat : selectedSeats) {
                    int rowNumber = Integer.parseInt(seat.substring(0, 1));
                    totalPrice += (rowNumber == 4 || rowNumber == 5 || rowNumber == 6) ? 10.0 : 8.0;
                }

                JOptionPane.showMessageDialog(null,
                        "Has seleccionado los asientos: " + selectedSeats +
                                "\nPrecio total: $" + totalPrice +
                                "\nGracias por tu compra. ¡Disfruta la película!");

                occupiedSeats.addAll(selectedSeats);
                saveOccupiedSeats();
                frame.dispose();
            });

            JButton resetButton = new JButton("Resetear Asientos");
            resetButton.addActionListener(e -> {
                occupiedSeats.clear();
                saveOccupiedSeats();
                selectedSeats.clear();
                frame.dispose();
                main(null); // Reiniciar la aplicación para refrescar la selección de asientos
            });

            frame.add(confirmButton);
            frame.add(resetButton);

            frame.setVisible(true);
        }
    }

    private static void loadOccupiedSeats() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            occupiedSeats = (ArrayList<String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se encontraron asientos ocupados previos.");
        }
    }

    private static void saveOccupiedSeats() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(occupiedSeats);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para redimensionar las imágenes
    private static Icon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
