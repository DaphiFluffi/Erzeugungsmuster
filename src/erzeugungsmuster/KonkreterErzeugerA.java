package erzeugungsmuster;

public class KonkreterErzeugerA extends Erzeuger {

	@Override
	public Produkt fabrikmethode() {
		
		return new KonkretesProduktA();
	}
		
}
