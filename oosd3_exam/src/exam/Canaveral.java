package exam;

public class Canaveral {

	public static void main(String[] args) {
		new Announcer().start();
		new Thread(new Kid()).start();
		
	}

}
