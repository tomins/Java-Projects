package exam;

import java.util.concurrent.ThreadLocalRandom;

public class Checker extends Thread{
	Chaser chaser = new Chaser();
	boolean level = true;
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			int sleepTime = ThreadLocalRandom.current().nextInt(1, 2000);
			try {
				Thread.sleep(sleepTime);
			}catch(InterruptedException e) {}
			level = chaser.checkLevel();
			ifLevel();
			
		}
	}
	
	public void ifLevel() {
		if(!level) {
			chaser.switchGame();
		}
	}

}
