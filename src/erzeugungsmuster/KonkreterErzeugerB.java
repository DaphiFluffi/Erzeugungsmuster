package erzeugungsmuster;

public class KonkreterErzeugerB extends Erzeuger {

	@Override
	public Produkt fabrikmethode() {
		
		return new KonkretesProduktB();
	}
		
}

