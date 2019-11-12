package fabrikmethode;

public class Main {
	
	public static void main(String args[]) {
		
		//Deklaration von e1 und e2 vom Typ Erzeuger
		Erzeuger e1; 
		Erzeuger e2;

		//Deklaration von e1 und e2 vom Typ Produkt
		Produkt p1;
		Produkt p2;
		
		e1 = new KonkreterErzeugerA(); // Polymorphie, weil der statische Typ von e1 Erzeuger ist und der dynamische sich unterscheidet, also hier KonkreterErzeugerA() ist
		p1 = e1.fabrikmethode(); // Das Produkt p1 wird mit Hilfe der fabrikmethode aus KonkreterErzeugerA() erstellt. Das Produkt hat also den dynamischen Typ konkretesProduktA().
		p1.print(); //Da p1 vom Typ KonkretesProduktA() ist, wird die print()-Methode aus dieser Klasse aufgerufen und "Ich bin Produkt A" zurückgegeben.
		
		e2 = new KonkreterErzeugerB(); // Polymorphie, weil der statische Typ von e1 Erzeuger ist und der dynamische sich unterscheidet, also hier KonkreterErzeugerB() ist
		p2 = e2.fabrikmethode(); // Das Produkt p2 wird mit Hilfe der fabrikmethode aus KonkreterErzeugerB() erstellt. Das Produkt hat also den dynamischen Typ konkretesProduktB().
		p2.print(); //Da p2 vom Typ KonkretesProduktB() ist, wird die print()-Methode aus dieser Klasse aufgerufen und "Ich bin Produkt B" zurückgegeben.
		
		
		
	}

}
