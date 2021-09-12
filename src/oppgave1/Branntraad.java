package oppgave1;

import static javax.swing.JOptionPane.showInputDialog;

public class Branntraad {
	public static String text = "Prove";
	
	public static void main(String[] args) {
	
		Thread t = new Traad();
		((Traad) t).setInput("Heia Brann!");
		t.start();
		String input = "";
		
		while(input != null && !input.equals("quit")) {
		input = showInputDialog("Skriv inn tekst");
		((Traad) t).setInput(input);
		
	}
		
		((Traad) t).stopp();
	}

}
