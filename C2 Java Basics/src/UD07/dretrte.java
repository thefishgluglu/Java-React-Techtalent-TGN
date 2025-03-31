package UD07;

import javax.swing.JOptionPane;

public class dretrte {
	public class Example {
		public static void main(String[] args) {
			String input = (String) JOptionPane.showInputDialog(null, "What is your name?", "Question",
					JOptionPane.QUESTION_MESSAGE);
			if (input != null) {
				System.out.println("User's name: " + input);
			} else {
				System.out.println("User canceled the input.");
			}
		}
	}

}
