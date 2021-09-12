package oppgave2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Servitor extends Thread {
	private BlockingQueue<Integer> burgerko;
	int randomsec = ThreadLocalRandom.current().nextInt(2000, 6000);

	public Servitor(BlockingQueue<Integer> burgerk) {
		this.burgerko = burgerk;
	}

	@Override

	public void run() {
		while (true) {
			while (burgerko.size() == 0) {
				try {
					Thread.sleep(randomsec);
				} catch (InterruptedException e) {
				}
			}
			try {
				Integer take = burgerko.take();
				System.out
						.println(Thread.currentThread().getName() + " tar av hamburger " + take + burgerko.toString());
				Thread.sleep(randomsec);
			} catch (InterruptedException e) {
			}
		}
	}
}

