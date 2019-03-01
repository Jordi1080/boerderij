package boerderij;

public class Fles {
		int inhoud;
		int maxInhoud;
		String soortInhoud;
		boolean dop;
		Fles(String a){
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
