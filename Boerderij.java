package boerderij;
import java.util.ArrayList;

public class Boerderij {
	ArrayList<Dier> dieren;// = new ArrayList<>();
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
		 
		 melkmachine = new MelkMachine();
		 //flessen = new ArrayList<>();
		 koopFlessen(10, geld);
		 
		 
		 geld = 1000;
		 boer = new Boer("Hans", 45, geld);
		 schoonmaker = new Schoonmaker("Mickey Mouse");
		 
		 melkmachine = new MelkMachine();
		 
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
		
		// we gaan dieren melken
		for (Dier d : dieren){
			melkmachine.melken(d);
		}
		
		// dop op fles 0 doen
		
		//boer.dopOpFlesDoen(melkmachine.getFlessen().get(0));
		//System.out.println("inhoud: " + melkmachine.getFlessen().get(0).inhoud);
		
		// schoonmaken
		//schoonmaker.schoonmaken(melkmachine.getFlessen().get(0));
		
		
		
	}
	
	public void koopFlessen(int aantal, int geld){
		
		for (int i = 0; i < aantal; i++){
			// melkmachine.getFlessen().add(new Fles("Melk"));
			melkmachine.addFles(new Fles("Melk"));
			geld -= 20;
		}
	}
	
	
}
