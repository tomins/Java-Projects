package textalerts;

public class World {

	public World(){
		MatchAttender match = new MatchAttender();
		AbsentFan fanA = new AbsentFan("home");
		AbsentFan fanB = new AbsentFan("away");
		AbsentFan fanC = new AbsentFan("home");
		
		fanA.addToList(match);
		fanB.addToList(match);
		fanC.addToList(match);
		
		
		match.updateScore("away");
		match.updateScore("home");
	}
	public static void main(String[] args) {
		System.out.println("\f");
		new World();

	}

}
