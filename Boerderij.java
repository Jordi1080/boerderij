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
		 Geit alfred = new Geit("Alfred");
		 dieren.add(bertha);
		 dieren.add(alfred);
		 
		 flessen = new ArrayList<>();
		 boer = new Boer("Hans", 45);
		 schoonmaker = new Schoonmaker();
		 melkmachine = new MelkMachine();
		 geld = 1000;
	}
	
	public void toonBoerderij(){
		// toon dieren
		System.out.println("Dit zijn de dieren:");
		for (Dier d : dieren){
			System.out.println(d.naam);
		}
	}
	
	
}
