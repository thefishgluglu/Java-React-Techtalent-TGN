package ui;

import javax.swing.*;
import db.UserDAO;
import logic.MasterMindGame;
import logic.MemoryMain;
import model.User;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String[] options = {"Login", "Registro", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Bienvenido a HDI-Games ", "HDI-GAMES",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 2 || choice == JOptionPane.CLOSED_OPTION) break;

            String username = JOptionPane.showInputDialog("Usuario:");
            String password = JOptionPane.showInputDialog("Contraseña:");

            if (username == null || password == null || username.isBlank() || password.isBlank()) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña vacíos.");
                continue;
            }

            User user = new User(username.trim(), password.trim());

            if (choice == 0) {
                if (UserDAO.loginUser(user)) {
                	// Crear ventana de selección de juego
                	JFrame gameFrame = new JFrame("Selecciona un juego");
                	gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                	gameFrame.setSize(300, 150);
                	gameFrame.setLayout(new FlowLayout());

                	JButton mastermindButton = new JButton("MasterMind");
                	JButton memoryButton = new JButton("Memory");

                	mastermindButton.addActionListener(e -> {
                	    gameFrame.dispose(); // cerrar selector
                	    MasterMindGame.startGame(user);
                	});

                	memoryButton.addActionListener(e -> {
                	    gameFrame.dispose();
                	    MemoryMain.startGame(user);
                	   
                	});

                	gameFrame.add(mastermindButton);
                	gameFrame.add(memoryButton);
                	gameFrame.setLocationRelativeTo(null); // centrar
                	gameFrame.setVisible(true);
                	break;

                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                }
            } else {
                if (UserDAO.registerUser(user)) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso. Inicia sesión.");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe o error.");
                }
            }
        }

        
    }
}
