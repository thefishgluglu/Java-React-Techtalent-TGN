
package UD07;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class T07_01 {

  public static void main(String[] args) {
    Map<String, ArrayList<Double>> notesAlumnes = demanarNotes(); 
    Map<String, Double> mitjanesAlumnes = calcularMitjanes(notesAlumnes); 
    mostrarMitjanes(mitjanesAlumnes); 
  }

  
  public static Map<String, ArrayList<Double>> demanarNotes() {
    Map<String, ArrayList<Double>> dades = new HashMap<>();

    int numAlumnes = Integer.parseInt(JOptionPane.showInputDialog("Quants alumnes vols introduir?"));

    for (int i = 0; i < numAlumnes; i++) {
      String nom = JOptionPane.showInputDialog("Nom de l'alumne " + (i + 1) + ":");

      ArrayList<Double> notes = new ArrayList<>();
      int numNotes = Integer.parseInt(JOptionPane.showInputDialog("Quantes notes té " + nom + "?"));

      for (int j = 0; j < numNotes; j++) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Introdueix la nota " + (j + 1) + ":"));
        notes.add(nota);
      }

      dades.put(nom, notes);
    }

    return dades;
  }

  
  public static Map<String, Double> calcularMitjanes(Map<String, ArrayList<Double>> dades) {
    Map<String, Double> mitjanes = new HashMap<>();

    for (Map.Entry<String, ArrayList<Double>> entrada : dades.entrySet()) {
      String alumne = entrada.getKey();
      ArrayList<Double> notes = entrada.getValue();

      double suma = 0;
      for (double nota : notes) {
        suma += nota;
      }

      double mitjana = suma / notes.size();
      mitjanes.put(alumne, mitjana);
    }

    return mitjanes;
  }

  
  public static void mostrarMitjanes(Map<String, Double> mitjanes) {
    StringBuilder result = new StringBuilder("\n--- Nota mitjana dels alumnes ---\n");
    for (Map.Entry<String, Double> entrada : mitjanes.entrySet()) {
      result.append(String.format("%s 🡆 %.2f%n", entrada.getKey(), entrada.getValue()));
    }
    JOptionPane.showMessageDialog(null, result.toString());
  }
}

