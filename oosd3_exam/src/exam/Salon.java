package exam;

import java.util.ArrayList;

public class Salon {
	
	int clientNum = 0;
	int client = 0;
	boolean space = true;
	
	public synchronized void addClient() {
		while(space) {
			
			try {
				this.wait();
			}catch(InterruptedException e) {}
			
				System.out.println("Client "+ client++);
				space = true;
				clientNum++;
				notifyAll();
	}
		
		public synchronized void removeClient() {
			while(!space) {
				
				try {
					this.wait();
				}catch(InterruptedException e) {}
				
					space = false;
					clientNum--;
				notifyAll();
		}
			
		
	
	public static void main(String[] args) {
		new Receptionist().start();
		new  Hairdresser().start();
	}

	
	

}
