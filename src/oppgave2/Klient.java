package oppgave2;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Klient {

	public static void main(String[] args) {
		BlockingQueue<Integer> burgerko = new LinkedBlockingQueue<Integer>();

		Thread kokk1 = new Kokk(burgerko);
		kokk1.setName("Philippe 1");
		Thread kokk2 = new Kokk(burgerko);
		kokk2.setName("Philippe 2");
		Thread kokk3 = new Kokk(burgerko);
		kokk3.setName("Philippe 3");

		Thread servitor1 = new Servitor(burgerko);
		servitor1.setName("Philiokus");
		Thread servitor2 = new Servitor(burgerko);
		servitor2.setName("Philikastisk");

		kokk1.start();
		kokk2.start();
		kokk3.start();
		servitor1.start();
		servitor2.start();

	}

}
