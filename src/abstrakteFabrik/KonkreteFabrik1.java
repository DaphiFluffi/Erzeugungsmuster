package abstrakteFabrik;

public class KonkreteFabrik1 implements IAbstrakteFabrik{

	@Override
	public IAbstraktesProduktA erzeugeProduktA() {
		// TODO Auto-generated method stub
		return new KonkretesProduktA1();
	}

	@Override
	public IAbstraktesProduktB erzeugeProduktB() {
		// TODO Auto-generated method stub
		return new KonkretesProduktB1();
	}

}
