package singleton;

final public class ToolTipManager3 { //final class, weil man dadurch von ToolTipManager nicht erben kann
	
	private static ToolTipManager3 instance; // private Klassenvariable instance
	
	private ToolTipManager3() {
		System.out.println("Ein neues Singleton erzeugt");
	
	}
	
	public static synchronized ToolTipManager3 getInstance() { //aufgrund des Schlüsselworts "synschrinzed" können nicht mehrere Prozesse gleichzeitig auf getInstance() zugreifen, wesewegen sichergestellt wird, dass immer nur eine instance existiert
		
		if ( instance == null) {  //sofern noch keine instance erstellt wurde, soll eine erstellt und zurückgegeben werden 
			instance = new ToolTipManager3(); //nicht-statische Initialisierung von instance
		}
		return instance;
	}
	
	public void operation() {
		System.out.println("operation() aufgerufen, hashCode " + this.hashCode()); //Ausgeben des Hashcodes zum testen, ob immer dasselbe Objekt erstellt wird
	}
	

}

