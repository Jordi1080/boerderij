package boerderij;

public class Koe extends Dier implements Melkbaar{
	int hoeveelheidMelk = 200;
	String naam;
	void geluidMaken() {
			System.out.println("Moeeeeeeeee");
		}
	Koe(String naam){
		this.naam = naam;
	}
	public void gemolkenWorden(int m) {
		if(hoeveelheidMelk < 0) {
			System.out.println("Je kan een lege koe niet melken");
		}else {
			hoeveelheidMelk =- m;
			System.out.println("Er is " + m + " geitenmelk uit koe " + naam + " gehaald. Er is nog " + hoeveelheidMelk + " over.");
		}
	}
	
	public int getHoeveelheidMelk() {
		return hoeveelheidMelk;
	}
	
}
