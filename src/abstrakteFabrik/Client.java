package abstrakteFabrik;

public class Client {

	IAbstrakteFabrik fabrik; //Attribut fabrik vom Typ IAbstrakteFabrik. Das ist ein Interface. Deswegen darf fabrik von jeder Klasse ein Typ sein, der IAbstrakteFabrik implementiert und konkret ist
	
	// das Attribut fabrik wird auf die uebergebene konkrete Fabrik gesetzt
	void setFabrik (IAbstrakteFabrik fabrik) { 
		this.fabrik = fabrik;
	}
}
