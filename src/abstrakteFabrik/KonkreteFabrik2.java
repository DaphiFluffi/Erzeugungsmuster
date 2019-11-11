package abstrakteFabrik;

public class KonkreteFabrik2 implements IAbstrakteFabrik { 
	
	@Override
	public IAbstraktesProduktA erzeugeProduktA() {
		// TODO Auto-generated method stub
		System.out.println("A2");
		return new KonkretesProduktA2();
	}

	@Override
	public IAbstraktesProduktB erzeugeProduktB() {
		// TODO Auto-generated method stub7
		System.out.println("B2");
		return new KonkretesProduktB2();
	}


}
