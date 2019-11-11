package abstrakteFabrik;

public class Client {

	IAbstrakteFabrik fabrik;
	
	void setFabrik (IAbstrakteFabrik fabrik) {
		this.fabrik = fabrik;
	}
}
