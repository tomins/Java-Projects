package textalerts;

import java.util.ArrayList;

public class MatchAttender {
	ArrayList<AbsentFan> fans;
	private int score1 = 0;
	private int score2 = 0;
	
	public MatchAttender(){
		fans = new ArrayList<>();
		
	}
	
	public void updateScore(String team){
		if(team.equalsIgnoreCase("home")){
			score1++;
		}
		else
			score2++;
		
		System.out.println("Score is now : " + score1 + " : " + score2);
		for(AbsentFan fan : fans){
			fan.reaction(team);
		}
	}
	
	public void addFan(AbsentFan fan){
		fans.add(fan);	
	}
	public void removeFan(AbsentFan fan){
		fans.remove(fan);	
	}



}
