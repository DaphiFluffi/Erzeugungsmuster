package fabrikmethode;

public class KonkretesProduktB extends Produkt {
	
	@Override
	//aus der abstrakten Methode print() aus Produkt eine konkrete Methode machen, die die Art des Produkts zurueckgibt
	public void print() {
		System.out.println("Ich bin Produkt B");
		
	}

}
