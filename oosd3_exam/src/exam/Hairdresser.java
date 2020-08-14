package exam;



public class Hairdresser extends Thread{
	Salon salon = new Salon();
	
	
	
	
	@Override
	public void run() {
		while(true) {
			try {
				this.wait();
			}catch(InterruptedException e) {}
			
			salon.removeClient();
			
			
				
			}
			
		}
	
	}



