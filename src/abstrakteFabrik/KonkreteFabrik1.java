package abstrakteFabrik;

public class KonkreteFabrik1 implements IAbstrakteFabrik{

	//Beide Methoden muessen public sein, da sie aus einem Interface stammen und die default visibility im Interface public, aber in Klassen package private ist

	@Override
	//Die Methode soll Produkte der Familie A erzeugen, darum gibt sie ein konkretes Produkt A1 zurueck
	// A1, weil die KonkreteFabrik1 laut UML Diagramm nur Produkte vom Typ A1 und B1 zurueckgeben kann
	public IAbstraktesProduktA erzeugeProduktA() {
		System.out.println("A1"); //Test, ob die richtige Methode in der Main aufgerufen wurde
		return new KonkretesProduktA1();
	}

	@Override
	//Die Methode soll Produkte der Familie B erzeugen, darum gibt sie ein konkretes Produkt B1 zurueck
	//B1, weil die KonkreteFabrik1 laut UML Diagramm nur Produkte vom Typ A1 und B1 zurueckgeben kann
	public IAbstraktesProduktB erzeugeProduktB() {
		System.out.println("B1"); //Test, ob die richtige Methode in der Main aufgerufen wurde
		return new KonkretesProduktB1();
	}

}
