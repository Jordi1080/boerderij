package boerderij;

// dier melken
// 
//
public class Boer {
	String naam;
	int leeftijd;
	int geld;
	Dier dier;
	Fles fles;

	Boer(String naam, int leeftijd, int geld) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.geld = geld;
	}

	void dierMelken(Dier dier) {
		System.out.println("Ik ga het dier melken");

	}

	void dopOpFlesDoen(Fles fles) {
		fles = new Fles("Melk");
		fles.dop = false;
		if (fles.inhoud == fles.maxInhoud) {
			System.out.println("De fles is vol en ik draai de dop er op");
			fles.dop = true;
		} else {
			System.out.println("de fles is nog niet vol");
		}

	}

	void schoonmakerBetalen() {

	}

	void schoonmakerAansturen() {

	}

	void bierDrinkenMetSchoonmaker() {

		System.out.println("biertje gedronken");
	}
}