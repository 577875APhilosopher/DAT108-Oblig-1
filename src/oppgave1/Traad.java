package oppgave1;

public class Traad extends Thread {
	boolean continued = true;
	String input ="";
	
	public Traad(String navn) {
		super(navn);
	}
	public Traad() {
		super();
	}
	public void stopp() {
		continued = false;
	}
	
	public void setInput(String input) {
		this.input=input;
	}
	
	public void run() {
		while (continued) {
			System.out.println(input);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
