package singleton;

public class SingletonTestThread2 extends Thread{
	public String threadName;
	
	public SingletonTestThread2(String tName){
		threadName = tName;
	}
	
	public void run(){
		try{
			Thread.sleep(500);
			System.out.println(threadName + " - call 1");
			ToolTipManager2.getInstance().operation();
			Thread.sleep(500);
			System.out.println(threadName + " - call 2");
			ToolTipManager2.getInstance().operation();
			Thread.sleep(500);
			System.out.println(threadName + " - call 3");
			ToolTipManager2.getInstance().operation();
		}
		catch(InterruptedException ie){
			System.out.println(threadName + " - interrupted.");
		}
	}
}
