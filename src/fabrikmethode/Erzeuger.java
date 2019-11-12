package fabrikmethode;

public abstract class Erzeuger {

	//Kopf der Fabrikmethode
	public abstract Produkt fabrikmethode();
	
	//konkrete Methode operation gibt bei Aufruf aus, dass etwas funktioniert hat.
	public void operation() {
		System.out.println("Hi, ich funktioniere.");
	}
}
