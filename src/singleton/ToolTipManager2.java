package singleton;

final public class ToolTipManager2 {  //final class, weil man dadurch von ToolTipManager nicht erben kann

		private static ToolTipManager2 instance = new ToolTipManager2(); //statische initialisierung von instance
		
		private ToolTipManager2() {//privater parameterloser Konstruktor
			System.out.println("ToolTipManager2::getInstance()");
		}
		
		public static ToolTipManager2 getInstance() { //da die instance statisch initialisiert wird, kann diese nicht null sein 
			return instance; 
		}
		
		public void operation() {
			System.out.println("operation() aufgerufen, hashCode " + this.hashCode()); //Ausgeben des Hashcodes zum testen, ob immer dasselbe Objekt erstellt wird
		}
	
}
