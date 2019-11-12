package fabrikmethode;

public class KonkreterErzeugerA extends Erzeuger {

	@Override
	//Ueberschreiben der Fabrikmethode aus der abstrakten Klasse Erzeuger
	//die Methode gibt ein Objekt vom Typ KonkretesProduktA() zurueck
	public Produkt fabrikmethode() {
		
		return new KonkretesProduktA(); 
	}
		
}
