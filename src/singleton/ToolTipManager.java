package singleton;

final public class ToolTipManager { //final class, weil man dadurch von ToolTipManager nicht erben kann
	
	private static ToolTipManager instance; // private Klassenvariable instance
	
	private ToolTipManager() { //privater parameterloser Konstruktor
		System.out.println("Ein neues Singleton erzeugt"); 
	
	}
	
	public static ToolTipManager getInstance() { //mehrere Prozesse können gleichzeitig auf getInstance() zugreifen, weil das Schlüsselwort synchronized fehlt
		
		if ( instance == null) { //sofern noch keine instance erstellt wurde, soll eine erstellt und zurückgegeben werden 
			instance = new ToolTipManager(); //nicht-statische Initialisierung von instance
		}
		return instance; 
	}
	
	public void operation() {
		System.out.println("operation() aufgerufen, hashCode " + this.hashCode()); //Ausgeben des Hashcodes zum testen, ob immer dasselbe Objekt erstellt wird
	}
	

}
