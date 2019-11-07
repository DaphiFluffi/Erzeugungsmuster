package abstrakteFabrik;

public interface IAbstrakteFabrik {

	IAbstraktesProduktA erzeugeProduktA() {
		return new AbstraktesProduktA();
	}
	
	IAbstraktesProduktB erzeugeProduktB() {
		return ;
	}
}
