package abstrakteFabrik;

public interface IAbstrakteFabrik {

	//das Interface IAbstrakteFabrik stellt zwei Methoden zur Verfuegung,
	//die als Rueckgabetyp die Interfaces IAbstraktesProduktA und IAbstraktesProduktB haben
	//?Das bedeutet zurueckgegeben können jegliche Objekte von Klassen, die diese beiden Interfaces implementieren
	IAbstraktesProduktA erzeugeProduktA ();
	
	IAbstraktesProduktB erzeugeProduktB ();
}
