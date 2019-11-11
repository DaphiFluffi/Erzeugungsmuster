package abstrakteFabrik;

public class Client {

	IAbstrakteFabrik fabrik;
	
	public void setFabrik ( IAbstrakteFabrik fabrik) {
		this.fabrik = fabrik;
	}
}
