package abstrakteFabrik;

public class Main {

	static Client c = new Client(); //Instanziieren der statischen Variable c vom Typ Client
	static KonkreteFabrik1 k1 = new KonkreteFabrik1(); //Instanziieren der statischen Variable k1 vom Typ KonkreteFabrik1
	static KonkreteFabrik2 k2 = new KonkreteFabrik2(); //Instanziieren der statischen Variable k2 vom Typ KonkreteFabrik2
	
	public static void main (String[] args) {
		
		
		c.setFabrik(k1); //die KonkreteFabrik1 wird ausgewählt
		
		k1.erzeugeProduktA(); //Das Produkt A1 wird erzeugt
		k1.erzeugeProduktB(); //Das Produkt B1 wird erzeugt
		
		c.setFabrik(k2); //die KonkreteFabrik2 wird ausgewählt
		
		k2.erzeugeProduktA(); //Das Produkt A2 wird erzeugt
		k2.erzeugeProduktB(); //Das Produkt B2 wird erzeugt
	
		
	}
}
