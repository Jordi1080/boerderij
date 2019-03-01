package boerderij;

public class Schoonmaker {
	boolean schoneHanden = true;
	String naam;
	int salaris;
	
	Schoonmaker(String naam){
		this.naam = naam;
	}
	
	void schoonmaken() {
		 schoneHanden = false;
		 System.out.println("Dat is lekker schoon, maar mijn handen zijn vies");
	 }//end schoonmaken
	
	void schoonmaken(Fles fles) {
		 schoneHanden = false;
		 System.out.println("Dat is een schone fles.");
	 }//end schoonmaken
	
	void biertjeDrinken() {
		System.out.println("Burp!");
	}//end biertjeDrinken
	

}
