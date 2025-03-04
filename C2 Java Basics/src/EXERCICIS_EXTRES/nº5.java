package EXERCICIS_EXTRES;

import javax.swing.JOptionPane;
public class nº5 {
	//El programa generarà un número aleatori entre 1 i 100 i l'usuari haurà d'intentar endevinar-lo. 
//	El programa donarà pistes de si el número és massa alt o massa baix fins que l’usuari encerti.
	public static void main(String[] args){
		int numaleatorio =  (int) (Math.random()*100 +1);
		     int num = 0;
		     int intentos = 0;
		     do {		    	
		    	 num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entre 1 y 100"));
		    	 intentos++;
		    	 if(num<numaleatorio) {
		    		 JOptionPane.showMessageDialog(null, "El numero es mas bajo");
		    	 }else if(num>numaleatorio) {
		    		 JOptionPane.showMessageDialog(null, "El numero es mas alto");
		    	 }
		     } while(num!=numaleatorio);
	}
}
		     
		     
				
		
				
	

