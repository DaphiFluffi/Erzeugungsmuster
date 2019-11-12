package fabrikmethode;

public class KonkreterErzeugerB extends Erzeuger {

	@Override
	//Ueberschreiben der Fabrikmethode aus der abstrakten Klasse Erzeuger
	//die Methode gibt ein Objekt vom Typ KonkretesProduktB() zurueck
	public Produkt fabrikmethode() {
		
		return new KonkretesProduktB();
	}
		
}

