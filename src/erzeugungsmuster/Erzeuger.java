package erzeugungsmuster;

public abstract class Erzeuger {

	//Kopf der Fabrikmethode
	public abstract Produkt fabrikmethode();
	
	public void operation() {
		System.out.println(new KonkreterErzeugerX());
		
		
	}
}
