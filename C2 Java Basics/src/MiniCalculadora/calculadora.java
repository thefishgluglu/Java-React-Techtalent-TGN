package MiniCalculadora;

import javax.swing.*;

public class calculadora extends JFrame {
    private final JTextField txtNum1 = new JTextField();
    private final JTextField txtNum2 = new JTextField();
    private final JTextField txtResultado = new JTextField();

    private final DBManager dbManager = new DBManager();

    public calculadora() {
        setTitle("Mini Calculadora");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblTitulo = new JLabel("Mini Calculadora");
        JLabel lblNum1 = new JLabel("Número 1:");
        JLabel lblNum2 = new JLabel("Número 2:");
        JLabel lblResultado = new JLabel("Resultado:");

        JButton btnSuma = new JButton("Sumar");
        JButton btnResta = new JButton("Restar");
        JButton btnMultiplicar = new JButton("Multiplicar");
        JButton btnDividir = new JButton("Dividir");
        JButton btnHistorial = new JButton("Ver Historial");

        lblTitulo.setBounds(140, 10, 200, 30);
        lblNum1.setBounds(50, 50, 100, 30);
        txtNum1.setBounds(150, 50, 150, 30);
        lblNum2.setBounds(50, 90, 100, 30);
        txtNum2.setBounds(150, 90, 150, 30);
        lblResultado.setBounds(50, 130, 100, 30);
        txtResultado.setBounds(150, 130, 150, 30);
        txtResultado.setEditable(false);

        btnSuma.setBounds(50, 180, 120, 30);
        btnResta.setBounds(200, 180, 120, 30);
        btnMultiplicar.setBounds(50, 220, 120, 30);
        btnDividir.setBounds(200, 220, 120, 30);
        btnHistorial.setBounds(125, 270, 150, 30);

        add(lblTitulo);
        add(lblNum1); add(txtNum1);
        add(lblNum2); add(txtNum2);
        add(lblResultado); add(txtResultado);
        add(btnSuma); add(btnResta);
        add(btnMultiplicar); add(btnDividir);
        add(btnHistorial);

        // Acciones
        btnSuma.addActionListener(e -> calcular("+"));
        btnResta.addActionListener(e -> calcular("-"));
        btnMultiplicar.addActionListener(e -> calcular("*"));
        btnDividir.addActionListener(e -> calcular("/"));
        btnHistorial.addActionListener(e -> new HistorialFrame(dbManager));

        setVisible(true);
    }

    private void calcular(String operador) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = switch (operador) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) throw new ArithmeticException("División por cero");
                    yield num1 / num2;
                }
                default -> throw new IllegalArgumentException("Operador inválido");
            };
            txtResultado.setText(String.valueOf(resultado));
            dbManager.guardarOperacion(num1, operador, num2, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa números válidos.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) {
        new calculadora();
    }
}
