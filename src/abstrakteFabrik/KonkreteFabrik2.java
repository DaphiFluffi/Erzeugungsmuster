package abstrakteFabrik;

public class KonkreteFabrik2 implements IAbstrakteFabrik{ {
	
	@Override
	public IAbstraktesProduktA erzeugeProduktA() {
		// TODO Auto-generated method stub
		return new KonkretesProduktA2();
	}

	@Override
	public IAbstraktesProduktB erzeugeProduktB() {
		// TODO Auto-generated method stub
		return new KonkretesProduktB2();
	}


}
