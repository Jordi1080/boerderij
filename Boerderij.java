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
		 koopFlessen(10, geld);
		 
		 
		 boer = new Boer("Hans", 45);
		 schoonmaker = new Schoonmaker();
		 schoonmaker.naam = "Mickey Mouse";
		 
		 melkmachine = new MelkMachine();
		 geld = 1000;
	}
	
	public void toonBoerderij(){
		// toon boer
		System.out.println("Welkom op de boerderij van boer " + boer.naam);
		System.out.println("Schoonmaker " + schoonmaker.naam + " werkt voor " + boer.naam);
		System.out.println("Boer " + boer.naam + " heeft " + geld + " euro.");
		System.out.println("");
		
		// toon dieren
		System.out.println("Dit zijn de dieren:");
		for (Dier d : dieren){
			System.out.println(d.naam);
		}
		System.out.println("");
		
		// 
	}
	
	public void koopFlessen(int aantal, int geld){
		
		for (int i = 0; i < aantal; i++){
			flessen.add(new Fles("Melk"));
		}
	}
	
	
}
