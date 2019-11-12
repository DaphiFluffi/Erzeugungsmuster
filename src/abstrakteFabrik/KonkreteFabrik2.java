package abstrakteFabrik;

public class KonkreteFabrik2 implements IAbstrakteFabrik { 
	
	//Beide Methoden muessen public sein, da sie aus einem Interface stammen und die default visibility im Interface public, aber in Klassen package private ist

	@Override
	//Die Methode soll Produkte der Familie A erzeugen, darum gibt sie ein konkretes Produkt A2 zurueck
	//A2, weil die KonkreteFabrik2 laut UML Diagramm nur Produkte vom Typ A2 und B2 zurueckgeben kann
	public IAbstraktesProduktA erzeugeProduktA() {
		System.out.println("A2"); //Test, ob die richtige Methode in der Main aufgerufen wurde
		return new KonkretesProduktA2();
	}

	//Die Methode soll Produkte der Familie B erzeugen, darum gibt sie ein konkretes Produkt B2 zurueck
	//B2, weil die KonkreteFabrik2 laut UML Diagramm nur Produkte vom Typ A2 und B2 zurueckgeben kann
	@Override
	public IAbstraktesProduktB erzeugeProduktB() {
		System.out.println("B2"); //Test, ob die richtige Methode in der Main aufgerufen wurde
		return new KonkretesProduktB2();
	}


}
