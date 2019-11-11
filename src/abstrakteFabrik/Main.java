package abstrakteFabrik;

public class Main {

	static Client c = new Client();
	
	public static void main (String[] args) {
		
		
		c.setFabrik(new KonkreteFabrik1());
		
	}
}
