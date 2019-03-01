package boerderij;

public class Koe extends Dier{
	int hoeveelheidMelk = 200;
	String naam;
	void geluidMaken() {
			System.out.println("Moeeeeeeeee");
		}
	Koe(String naam){
		this.naam = naam;
	}
}
