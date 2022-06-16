
public class Main {

	public static void main(String[] args) {
		    Macchina auto1 = new Macchina("Alfa Romeo",  1400, "XX 004 CC",  30000,  "brown",  5);
			Macchina auto2 = new Macchina( "Bentley", 1500,   "AA 050 VV",  50000,  "white", 6);
			Macchina auto3 = new Macchina( "BMW",  1100, "RR 040 TB",  20000,  "black", 6);
			Macchina auto4 = new Macchina( "Audi",  1400, "AV 400 XX",  30000, "grey",  6);
	        Macchina auto5 = new Macchina( "Fiat",  1200, "XX 333 EE", 10000,  "white",  5);
		
	        Macchina[] auto = {auto1, auto2, auto3, auto4, auto5};
	        
	        infoMacchinaPiuCostosa(auto);
	        infoMacchina( auto,  "XX 004 CC");
	        infoMacchina( auto, "brown");
	        
}
static void infoMacchinaPiuCostosa(Macchina[] temp) {
	Macchina maxPrice = temp[0];
	for (int i = 0; i < temp.length; i++) {
		if (temp[i].getValore() > maxPrice.getValore()) {
			maxPrice = temp[i];
		}
	}
	
	System.out.println("Il veicolo piu' costoso: ");
	
	maxPrice.stampaInformazioni();
}

static void infoMacchina(Macchina[] temp, String targa) {
	Macchina myTarga = null;
	for (int i = 0; i < temp.length; i++) {
		if (temp[i].getTarga().toUpperCase().equals(targa.toUpperCase())) {
			myTarga=temp[i];
		}
		
		}System.out.println("********************");
	System.out.println("Il veicolo con targa: " + targa);
	myTarga.stampaInformazioni();
	}


static void infoMacchinaColore(Macchina[] temp, String colore) {
	Macchina myColor = null;
	for (int i = 0; i < temp.length; i++) {
		if (temp[i].getColore().toUpperCase().equals(colore)) {
			myColor=temp[i];
		}
		
	}  System.out.println("********************");
	   System.out.println("Il veicolo con il colore: " + colore);
	   myColor.stampaInformazioni();
	}
}
