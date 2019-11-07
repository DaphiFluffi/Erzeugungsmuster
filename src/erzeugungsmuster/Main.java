package erzeugungsmuster;

public class Main {
	
	public static void main(String args[]) {
		
		Erzeuger e1;
		Produkt p1;
		
	
		
		e1 = new KonkreterErzeugerX();
		e1.operation();
		
		
		p1 = e1.fabrikmethode();
		p1.print();
		
		
		
		
	}

}
