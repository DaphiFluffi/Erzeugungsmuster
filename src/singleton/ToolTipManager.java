package singleton;

final public class ToolTipManager {
	
	private static ToolTipManager instance;
	
	private ToolTipManager() {
		System.out.println("Ein neues Singleton erzeugt");
	
	}
	
	
	public static ToolTipManager getInstance() {
		
		if ( instance == null) {
			instance = new ToolTipManager();
		}
		return instance;
	}
	
	public void operation() {
		System.out.println("operation() aufgerufen");
	}
	

}
