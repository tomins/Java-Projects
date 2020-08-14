package exam;

import java.util.concurrent.ThreadLocalRandom;

public class Kid implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			int sleepTime = ThreadLocalRandom.current().nextInt(1, 2000);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {}
			System.out.println("Yayyyy");
		}

	}

}
