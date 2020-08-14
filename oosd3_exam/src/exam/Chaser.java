package exam;

import java.util.concurrent.ThreadLocalRandom;

public class Chaser extends Thread{
	
	private int coneLeft = 0;
	private int coneRight = 0;
	private boolean gameOver = false;
	
	@Override
	public void run() {
		do {
			for(int i = 0;i<=10;i++) {
				int sleepTime = ThreadLocalRandom.current().nextInt(1, 2000);
				try {
					Thread.sleep(sleepTime);
				}catch(InterruptedException e) {}
				System.out.println("Chaser has the left cone to row " + coneLeft++);
				System.out.println("Chaser has the right cone to row " + coneRight++);
			}
		}while(gameOver == false && coneRight < 10 );
		endGame();
	}
	
	public boolean checkLevel() {
		if(coneLeft != coneRight) 
			return true;
		else
			return false;
	}
	
	public void switchGame() {
		gameOver = !gameOver;
	}
	
	public void endGame() {
		if(gameOver == true)
			System.out.println("Checker wins");
		else
			System.out.println("Chaser wins");
		
	}
	
	

}
