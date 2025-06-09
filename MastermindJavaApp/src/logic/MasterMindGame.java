package logic;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.Timer;

import db.GameDAO;
import model.User;

public class MasterMindGame {

    private static final int MAX_ROWS = 10;
    private static final int MAX_COLS = 4;

    private static int currentRow = 0;
    private static int currentCol = 0;

    private static final Color[] COLORS = {Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW};
    private static final String[] COLOR_CODES = {"1", "2", "3", "4"};

    private static String secretCode;
    private static JButton[][] grid = new JButton[MAX_ROWS][MAX_COLS];
    private static JButton[][] feedbackGrid = new JButton[MAX_ROWS][MAX_COLS];

    private static StringBuilder currentGuess = new StringBuilder();

    private static User currentUser;
    private static LocalDateTime startTime;
    private static LocalDateTime endTime;
    private static Timer gameTimer;
    private static JLabel timerLabel;
    private static int secondsElapsed = 0;

    public static void startGame(User user) {
        currentUser = user;
        startTime = LocalDateTime.now();
        currentRow = 0;
        currentCol = 0;
        currentGuess.setLength(0);
        secretCode = generateCode();

        JFrame frame = new JFrame("MasterMind - Jugador: " + user.getUsername());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLayout(new BorderLayout());

        JPanel colorPanel = new JPanel(new FlowLayout());
        String[] colorNames = {"Azul", "Rojo", "Verde", "Amarillo"};

        for (int i = 0; i < COLORS.length; i++) {
            JButton colorButton = new JButton(colorNames[i]);
            colorButton.setPreferredSize(new Dimension(100, 40));
            colorButton.setBackground(COLORS[i]);
            colorButton.setForeground(Color.BLACK);
            int colorIndex = i;

            colorButton.addActionListener(e -> handleColorClick(colorIndex));
            colorPanel.add(colorButton);
        }

        JPanel gamePanel = new JPanel(null);
        gamePanel.setPreferredSize(new Dimension(600, 550));

        JPanel boardPanel = new JPanel(null);
        boardPanel.setBounds(20, 10, 300, 500);

        int buttonWidth = 40;
        int buttonHeight = 40;
        int spacingX = 10;
        int spacingY = 10;

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int col = 0; col < MAX_COLS; col++) {
                JButton slot = new JButton();
                slot.setEnabled(false);
                slot.setBackground(Color.LIGHT_GRAY);
                int x = col * (buttonWidth + spacingX);
                int y = row * (buttonHeight + spacingY);
                slot.setBounds(x, y, buttonWidth, buttonHeight);
                grid[row][col] = slot;
                boardPanel.add(slot);
            }
        }

        JPanel feedbackPanel = new JPanel(null);
        feedbackPanel.setBounds(350, 20, 400, 500);

        int fbSize = 20;
        int fbSpacingX = 15;
        int fbSpacingY = 30;

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int i = 0; i < MAX_COLS; i++) {
                JButton fb = new JButton();
                fb.setEnabled(false);
                fb.setBackground(Color.DARK_GRAY);
                int x = i * (fbSize + fbSpacingX);
                int y = row * (fbSize + fbSpacingY);
                fb.setBounds(x, y, fbSize, fbSize);
                feedbackGrid[row][i] = fb;
                feedbackPanel.add(fb);
            }
        }

        gamePanel.add(boardPanel);
        gamePanel.add(feedbackPanel);

        timerLabel = new JLabel("\u23F1 Tiempo: 0s");
        timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        timerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(timerLabel, BorderLayout.SOUTH);

        gameTimer = new Timer(1000, e -> {
            secondsElapsed++;
            timerLabel.setText("\u23F1 Tiempo: " + secondsElapsed + "s");
        });
        gameTimer.start();

        frame.add(colorPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void handleColorClick(int colorIndex) {
        if (currentRow >= MAX_ROWS) {
            JOptionPane.showMessageDialog(null, "Juego terminado. El código era: " + secretCode);
            return;
        }

        if (currentCol < MAX_COLS) {
            JButton slot = grid[currentRow][currentCol];
            slot.setBackground(COLORS[colorIndex]);
            currentGuess.append(COLOR_CODES[colorIndex]);
            currentCol++;
        }

        if (currentCol == MAX_COLS) {
            String guess = currentGuess.toString();

            int correctPos = getCorrectPosition(secretCode, guess);
            int correctColor = getCorrectColor(secretCode, guess) - correctPos;

            for (int i = 0; i < MAX_COLS; i++) {
                JButton fb = feedbackGrid[currentRow][i];
                if (i < correctPos) {
                    fb.setBackground(Color.magenta);
                } else if (i < correctPos + correctColor) {
                    fb.setBackground(Color.orange);
                } else {
                    fb.setBackground(Color.DARK_GRAY);
                }
            }

            String feedbackText = correctPos + " correctos en posición, " + correctColor + " colores correctos mal ubicados";
            JOptionPane.showMessageDialog(null, "Intento " + (currentRow + 1) + ": " + feedbackText);

            if (guess.equals(secretCode)) {
                endTime = LocalDateTime.now();
                gameTimer.stop();
                GameDAO.saveGame(currentUser, startTime, endTime, true, currentRow + 1);

                JOptionPane.showMessageDialog(null, "🎉 ¡Correcto! Has adivinado el código.");
                currentRow = MAX_ROWS;
            } else {
                currentRow++;
                currentCol = 0;
                currentGuess.setLength(0);

                if (currentRow == MAX_ROWS) {
                    endTime = LocalDateTime.now();
                    gameTimer.stop();
                    GameDAO.saveGame(currentUser, startTime, endTime, false, MAX_ROWS);

                    JOptionPane.showMessageDialog(null, "❌ Has perdido. El código era: " + secretCode);
                }
            }
        }
    }

    private static String generateCode() {
        StringBuilder code = new StringBuilder();
        while (code.length() < 4) {
            int digit = 1 + (int)(Math.random() * 4);
            code.append(digit);
        }
        System.out.println("DEBUG - Código secreto: " + code);
        return code.toString();
    }

    private static int getCorrectPosition(String secret, String guess) {
        int correct = 0;
        for (int i = 0; i < 4; i++) {
            if (secret.charAt(i) == guess.charAt(i)) correct++;
        }
        return correct;
    }

    private static int getCorrectColor(String secret, String guess) {
        int[] secretCounts = new int[5];
        int[] guessCounts = new int[5];

        for (int i = 0; i < 4; i++) {
            secretCounts[secret.charAt(i) - '0']++;
            guessCounts[guess.charAt(i) - '0']++;
        }

        int total = 0;
        for (int i = 1; i <= 4; i++) {
            total += Math.min(secretCounts[i], guessCounts[i]);
        }

        return total;
    }
}
