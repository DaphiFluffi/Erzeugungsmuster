package erzeugungsmuster;

public class Main {
	
	public static void main(String args[]) {
		
		Erzeuger e1;
		Produkt p1;
		
		e1 = new KonkreterErzeugerA();
		p1 = e1.fabrikmethode();
		p1.print();
		
		e1 = new KonkreterErzeugerB();
		p1 = e1.fabrikmethode();
		p1.print();
		
		
	}

}
