package singleton;

final public class ToolTipManager2 {

		private static ToolTipManager2 instance = new ToolTipManager2(); //statische initialisierung 
		
		private ToolTipManager2() {
			System.out.println("ToolTipManager2::getInstance()");
		}
		
		public static ToolTipManager2 getInstance() {
			return instance; 
		}
		
		public void operation() {
			System.out.println("operation() aufgerufen");
		}
	
}
