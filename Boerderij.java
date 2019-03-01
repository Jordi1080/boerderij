package boerderij;
import java.util.ArrayList;

public class Boerderij {
	ArrayList<Dier> dieren;// = new ArrayList<>();
	ArrayList<Fles> flessen;// = new ArrayList<>();
	Boer boer;
	int geld;
	
	public Boerderij(){
		 dieren = new ArrayList<>();
		 flessen = new ArrayList<>();
		 boer = new Boer("Hans", 45);
		 geld = 1000;
	}
	
	
}
