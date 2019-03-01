package boerderij;

public class Schoonmaker {
	boolean schoneHanden = true;
	String naam;
	int salaris;
	
	Schoonmaker(String naam){
		this.naam = naam;
	}
	
	void schoonmaken(Dier dier) {
		 schoneHanden = false;
		 System.out.println("Zo, "+dier.naam+" is schoon, maar mijn handen zijn vies");
	 }//end schoonmaken
	
	void schoonmaken(Fles fles) {
		if(fles.inhoud > 0) {
			System.out.println("Ah lekker, er is zit nog" +fles.soortInhoud+" in. Jam Jam");
			fles.inhoud = 0;
		}
		else{
			System.out.println("Zo, ff lekker deze " +fles.soortInhoud + "fles schoonmaken.");
		}
		 schoneHanden = false;
		 System.out.println("Dat is een schone" + fles);
	 }//end schoonmaken
	
	void biertjeDrinken() {
		System.out.println("Burp!");
	}//end biertjeDrinken
	

}
