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
		}
		boolean dopErop(){
			dop = true;
			return dop;
		}
}
