package boerderij;

public class Fles {
		int inhoud;
		int maxInhoud;
		String soortInhoud;
		boolean dop;
		Fles(String a){
			maxInhoud = 10;
			soortInhoud = a;
		}
		void flesVullen(int hoeveelheid) {
			inhoud = hoeveelheid;
			if (inhoud>10) {
				System.out.println("Dat past niet. Er kan max 10L in een fles.");
			}else {
				System.out.println("Er zit " + inhoud + "L in de fles.");
			}
		}
		boolean dopErop(){
			dop = true;
			return dop;
		}
}
