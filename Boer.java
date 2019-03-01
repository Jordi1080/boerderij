package boerderij;

// dier melken
// 
//
public class Boer {
	String naam;
	int leeftijd;

	Boer(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
	}

	void dierMelken(Dier dier) {
		System.out.println("Ik ga het dier melken");
	}

	void flesPakken(Fles fles) {
		System.out.println("Ik pak de fles");
	}

}