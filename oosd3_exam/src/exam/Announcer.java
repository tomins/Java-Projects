package exam;

import java.util.concurrent.ThreadLocalRandom;

public class Announcer extends Thread {

	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			int sleepTime = ThreadLocalRandom.current().nextInt(1, 1000);
			try {
				Thread.sleep(sleepTime);
			}catch(InterruptedException e) {}
			System.out.println(10-i);
		}
		System.out.println("Liftoff!!!");
	}
}
