package boerderij;
import java.util.ArrayList;

public class Boerderij {
	ArrayList<Dier> dieren;// = new ArrayList<>();
	ArrayList<Fles> flessen;// = new ArrayList<>();
	Boer boer;
	Schoonmaker schoonmaker;
	MelkMachine melkmachine;
	int geld;
	
	public Boerderij(){
		 dieren = new ArrayList<>();
		 Koe bertha = new Koe("Bertha");
		 Geit alfred = new Geit();
		 
		 flessen = new ArrayList<>();
		 boer = new Boer("Hans", 45);
		 schoonmaker = new Schoonmaker();
		 melkmachine = new MelkMachine();
		 geld = 1000;
	}
	
	
}
