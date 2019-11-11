package abstrakteFabrik;

public class Main {

	static Client c = new Client();
	static KonkreteFabrik1 k1 = new KonkreteFabrik1();
	static KonkreteFabrik2 k2 = new KonkreteFabrik2();
	
	public static void main (String[] args) {
		
		
		c.setFabrik(k1);
		
		k1.erzeugeProduktA(); //A1
		k1.erzeugeProduktB(); //B1
		
		c.setFabrik(k2);
		
		k2.erzeugeProduktA(); //A2k
		k2.erzeugeProduktB(); //B2
	
		
	}
}
