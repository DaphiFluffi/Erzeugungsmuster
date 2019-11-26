package singleton;

public class SingletonTestThread extends Thread{ 
	public String threadName;
	
	public SingletonTestThread(String tName){ //public KOnstruktor für SingletonTestThread
		threadName = tName;
	}
	
	public void run(){ //run()-Methode zum Testen von ToolTipManager3 mit der nicht-statischen Initialisierung
		try{
			Thread.sleep(500);
			System.out.println(threadName + " - call 1");
			ToolTipManager3.getInstance().operation();
			Thread.sleep(500);
			System.out.println(threadName + " - call 2");
			ToolTipManager3.getInstance().operation();
			Thread.sleep(500);
			System.out.println(threadName + " - call 3");
			ToolTipManager3.getInstance().operation();
		}
		catch(InterruptedException ie){
			System.out.println(threadName + " - interrupted.");
		}
	}
}
