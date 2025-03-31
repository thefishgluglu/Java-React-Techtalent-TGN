package UD08;

import javax.swing.JOptionPane;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
		
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	
    }
    public String generarPassword() {
    	longitud = jOshowInputDialog("Introduce la longitud de la contraseña: ");
    }
    private int jOshowInputDialog(String string) {
    	String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    	StringBuilder password = new StringBuilder(); 
    	for (int i = 0; i<longitud; i++) {
        	 int num = ( int) (Math.random() * caracteres.length());
        	 contraseña += caracteres.charAt(num);
        	 }
		return 0;
	}

	public String getContraseña() {
    	return contraseña;
    	
    }
	}

	


