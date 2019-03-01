package boerderij;

public class Geit extends Dier implements Melkbaar{
	String naam;
	int hoeveelheidMelk = 50;
	
	Geit(String naam){
		this.naam = naam;
	}
	
	void geluidMaken(){
		System.out.println("meeeeeeeh");
	}
	public void gemolkenWorden(int m) {
		if(hoeveelheidMelk < 0) {
			System.out.println("Je kan een lege geit niet melken");
		}else {
			hoeveelheidMelk =- m;
			System.out.println("Er is " + m + " geitenmelk uit geit " + naam + " gehaald. Er is nog " + hoeveelheidMelk + " over.");
		}
	}
}
