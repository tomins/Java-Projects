package textalerts;

public class AbsentFan extends InterestedParty{
	private MatchAttender attender;
	private String support;
	
	public AbsentFan(String supporter){
		this.support = supporter;
	}
	
	public void addToList(MatchAttender man){
		this.attender = man;
		attender.addFan(this);
		
	}
	
	public void removeFromList(){
		attender.removeFan(this);
	}
	
	public void reaction(String team){
		if(team.equals("home")){
			if(this.support.equalsIgnoreCase("home"))
				System.out.println("Yayy");
			else
				System.out.println("NOOOOO");
		}
		else{
			if(this.support.equalsIgnoreCase("away"))
				System.out.println("Yayy");
			else
				System.out.println("NOOOOO");
		}
			
	}

}
