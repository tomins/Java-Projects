package exam;



public class Receptionist extends Thread{
	
	Salon salon = new Salon();
	
	
	@Override
	public void run() {
		while(true) {
			
			
			try {
				this.wait();
			}catch(InterruptedException e) {}
			
				
				salon.addClient();
				
			
			
				
			
		}
	}
	


	
	

	
}
