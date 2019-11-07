package erzeugungsmuster;

public class Main {
	
	public static void main(String args[]) {
		
		Erzeuger e1;
		Erzeuger e2;

		Produkt p1;
		Produkt p2;
		
		e1 = new KonkreterErzeugerA();
		p1 = e1.fabrikmethode();
		p1.print();
		
		e2 = new KonkreterErzeugerB();
		p2 = e2.fabrikmethode();
		p2.print();
		
		
	}

}
