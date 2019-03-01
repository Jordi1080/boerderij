package boerderij;

import java.util.List;

public class MelkMachine {
	private List<Fles> flessen;
	private Fles huidigefles;
	
	public MelkMachine(){
		
		
		
	}
	
	public void melken(Dier dier) {
		if (huidigefles==null) {
			huidigefles = new Fles("Melk");
		}
		if(dier instanceof Melkbaar) {
			Melkbaar melkbaar = (Melkbaar) dier;
				int opvragen = Math.min(huidigefles.maxInhoud-huidigefles.inhoud,melkbaar.getHoeveelheidMelk())
				melkbaar.gemolkenWorden(opvragen);	
				huidigefles.flesVullen(opvragen);
		}
	}
}
