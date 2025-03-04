package UD06;
import java.util.Random;
import javax.swing.JOptionPane;
public class T06_02 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero: "));
		for (int i =1 ; num<=5 ; num++) {
		}
		Random random = new Random();
        int randomInt = random.nextInt(); 
        
        System.out.println("Número entero aleatorio: " + randomInt);
	}
	
		
	}


