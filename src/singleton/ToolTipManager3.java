package singleton;

final public class ToolTipManager3 {
	
	private static ToolTipManager3 instance;
	
	private ToolTipManager3() {
		System.out.println("Ein neues Singleton erzeugt");
	
	}
	
	
	public static synchronized ToolTipManager3 getInstance() {
		
		if ( instance == null) {
			instance = new ToolTipManager3();
		}
		return instance;
	}
	
	public void operation() {
		System.out.println("operation() aufgerufen, hashCode " + this.hashCode());
	}
	

}

