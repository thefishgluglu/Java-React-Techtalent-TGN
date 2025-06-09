package logic;
	
	import javax.swing.*;
	import javax.swing.Timer;
	import logic.MemoryMain;

	import java.awt.*;
	import java.awt.EventQueue;
	import java.awt.Point;
	import java.awt.event.ActionListener;
	import java.util.*;
	import model.User;


	public class MemoryMain extends JFrame {
		
			
		

	    private JPanel contentPane;
	    private JButton opcionUno;
	    private JButton opcionDos;
	    private JButton opcionTres;
	    private JButton opcionCuatro;
	    private JButton opcionCinco;
	    private JButton opcionSeis;
	    private JButton opcionSiete;
	    private JButton opcionOcho;
	    private JButton opcionNueve;
	    private JButton opcionDiez;
	    private JButton opcionOnce;
	    private JButton opcionDoce;
	    private JButton opcionTrece;
	    private JButton opcionCatorze;
	    private JButton opcionQuince;
	    private JButton opcionDieciseis;

	    private Map<JButton, Color> cardColors;
	    private JButton firstButton;
	    private int pairsFound;

	    public static void startGame(User user) {
	        EventQueue.invokeLater(() -> {
	            try {
	                MemoryMain frame = new MemoryMain();
	                frame.memory();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	   
	    public void memory() {
	        setTitle("Memory");
	        setBounds(300, 350, 613, 635);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);

	        contentPane = new JPanel();
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        contentPane.setBackground(new Color(153, 51, 255));

	       
	        opcionUno = new JButton();
	        opcionUno.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionUno.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionUno);

	        opcionDos = new JButton();
	        opcionDos.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionDos.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionDos);

	        opcionTres = new JButton();
	        opcionTres.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionTres.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionTres);

	        opcionCuatro = new JButton();
	        opcionCuatro.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionCuatro.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionCuatro);

	        opcionCinco = new JButton();
	        opcionCinco.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionCinco.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionCinco);

	        opcionSeis = new JButton();
	        opcionSeis.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionSeis.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionSeis);

	        opcionSiete = new JButton();
	        opcionSiete.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionSiete.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionSiete);

	        opcionOcho = new JButton();
	        opcionOcho.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionOcho.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionOcho);

	        opcionNueve = new JButton();
	        opcionNueve.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionNueve.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionNueve);

	        opcionDiez = new JButton();
	        opcionDiez.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionDiez.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionDiez);

	        opcionOnce = new JButton();
	        opcionOnce.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionOnce.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionOnce);

	        opcionDoce = new JButton();
	        opcionDoce.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionDoce.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionDoce);

	        opcionTrece = new JButton();
	        opcionTrece.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionTrece.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionTrece);

	        opcionCatorze = new JButton();
	        opcionCatorze.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionCatorze.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionCatorze);

	        opcionQuince = new JButton();
	        opcionQuince.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionQuince.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionQuince);

	        opcionDieciseis = new JButton();
	        opcionDieciseis.setFont(new Font("Arial", Font.BOLD, 18));
	        opcionDieciseis.setBackground(new Color(252, 81, 81));
	        contentPane.add(opcionDieciseis);

	        random();

	        logica();
	    }

	  
	    public void random() {
	        ArrayList<Point> posiciones = new ArrayList<>();
	        for (int fila = 0; fila < 4; fila++) {
	            for (int col = 0; col < 4; col++) {
	                posiciones.add(new Point(col * 150, fila * 150));
	            }
	        }
	        Collections.shuffle(posiciones);

	        JButton[] botones = {
	            opcionUno, opcionDos, opcionTres, opcionCuatro,
	            opcionCinco, opcionSeis, opcionSiete, opcionOcho,
	            opcionNueve, opcionDiez, opcionOnce, opcionDoce,
	            opcionTrece, opcionCatorze, opcionQuince, opcionDieciseis
	        };

	        for (int i = 0; i < botones.length; i++) {
	            Point p = posiciones.get(i);
	            botones[i].setBounds(p.x, p.y, 150, 150);
	        }
	    }

	  
	    public void logica() {
	        firstButton = null;
	        pairsFound = 0;
	        cardColors = new HashMap<>();

	        ArrayList<Color> colores = new ArrayList<>();
	        colores.add(new Color(255, 255, 255));
	        colores.add(new Color(255, 255, 255));
	        colores.add(new Color(0, 255, 255));
	        colores.add(new Color(0, 255, 255));
	        colores.add(new Color(255, 255, 0));
	        colores.add(new Color(255, 255, 0));
	        colores.add(new Color(0, 255, 0));
	        colores.add(new Color(0, 255, 0));
	        colores.add(new Color(0, 0, 0));
	        colores.add(new Color(0, 0, 0));
	        colores.add(new Color(102, 102, 0));
	        colores.add(new Color(102, 102, 0));
	        colores.add(new Color(0, 0, 255));
	        colores.add(new Color(0, 0, 255));
	        colores.add(new Color(204, 153, 255));
	        colores.add(new Color(204, 153, 255));
	        Collections.shuffle(colores);

	        JButton[] botones = {
	            opcionUno, opcionDos, opcionTres, opcionCuatro,
	            opcionCinco, opcionSeis, opcionSiete, opcionOcho,
	            opcionNueve, opcionDiez, opcionOnce, opcionDoce,
	            opcionTrece, opcionCatorze, opcionQuince, opcionDieciseis
	        };
	        for (int i = 0; i < botones.length; i++) {
	            cardColors.put(botones[i], colores.get(i));
	        }

	       
	        for (JButton btn : botones) {
	            for (ActionListener al : btn.getActionListeners()) {
	                btn.removeActionListener(al);
	            }
	            btn.setBackground(new Color(252, 81, 81));
	            btn.setEnabled(true);

	            btn.addActionListener(e -> {
	                JButton clicked = (JButton) e.getSource();
	                if (firstButton == clicked) {
	                    return;
	                }

	                clicked.setBackground(cardColors.get(clicked));
	                clicked.setEnabled(false);

	                if (firstButton == null) {
	                    firstButton = clicked;
	                } else {
	                    Color c1 = cardColors.get(firstButton);
	                    Color c2 = cardColors.get(clicked);
	                    if (c1.equals(c2)) {
	                        firstButton = null;
	                        pairsFound++;
	                        if (pairsFound == 8) {
	                            JOptionPane.showMessageDialog(
	                                this,
	                                "Â¡Has obtenido la victoria!",
	                                "Victoria",
	                                JOptionPane.INFORMATION_MESSAGE
	                            );
	                            reiniciarJuego();
	                        }
	                    } else {
	                        Timer t = new Timer(400, ev -> {
	                            clicked.setBackground(new Color(252, 81, 81));
	                            firstButton.setBackground(new Color(252, 81, 81));
	                            clicked.setEnabled(true);
	                            firstButton.setEnabled(true);
	                            firstButton = null;
	                        });
	                        t.setRepeats(false);
	                        t.start();
	                    }
	                }
	            });
	        }
	    }

	  
	    private void reiniciarJuego() {
	        pairsFound = 0;
	        firstButton = null;

	        JButton[] botones = {
	            opcionUno, opcionDos, opcionTres, opcionCuatro,
	            opcionCinco, opcionSeis, opcionSiete, opcionOcho,
	            opcionNueve, opcionDiez, opcionOnce, opcionDoce,
	            opcionTrece, opcionCatorze, opcionQuince, opcionDieciseis
	        };
	        for (JButton btn : botones) {
	            btn.setEnabled(true);
	            btn.setBackground(new Color(252, 81, 81));
	        }
	        random();
	     
	    }
	}
