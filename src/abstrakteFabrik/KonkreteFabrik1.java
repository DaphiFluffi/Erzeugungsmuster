package abstrakteFabrik;

public class KonkreteFabrik1 implements IAbstrakteFabrik{

	@Override
	public IAbstraktesProduktA erzeugeProduktA() {
		// TODO Auto-generated method stub
		System.out.println("A1");
		return new KonkretesProduktA1();
	}

	@Override
	public IAbstraktesProduktB erzeugeProduktB() {
		// TODO Auto-generated method stub
		System.out.println("B1"); 
		return new KonkretesProduktB1();
	}

}
