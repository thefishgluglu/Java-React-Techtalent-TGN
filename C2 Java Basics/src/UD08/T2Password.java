
package UD08;

import javax.swing.JOptionPane;

public class T2Password {

    
    private int longitud = 8;
    private String password;

    
    public T2Password() {
        this.longitud = longitud;
        this.password = generarPassword(this.longitud);
    }

    public T2Password(int longitud) {
        this.longitud = genlongitud();
        this.password = generarPassword(longitud);
    }

    private int genlongitud() {
        
        String input = JOptionPane.showInputDialog("Introduce la longitud de la contraseña: ");
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se usará la longitud por defecto de 8.");
            return 8; 
        }
    }

   
    private String generarPassword(int length) {
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * caracteres.length());
            password.append(caracteres.charAt(index));
        }
        return password.toString();
    }

    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
