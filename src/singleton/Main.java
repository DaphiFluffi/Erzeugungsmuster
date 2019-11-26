package singleton;

public class Main {

	public static void main(String[] args) {
		
		//Testen der statischen Initialisierung in ToolTipManager2 mit Hilfe der Klasse SingletonTestThread2
		/*SingletonTestThread2 s1 = new SingletonTestThread2("Thread 1");
		SingletonTestThread2 s2 = new SingletonTestThread2("Thread 2");
		SingletonTestThread2 s3 = new SingletonTestThread2("Thread 3");*/
	
		//Testen der nicht-statischen Initialisierung in ToolTipManager3 mit Hilfe der Klasse SingletonTestThread

		SingletonTestThread s1 = new SingletonTestThread("Thread 1"); 
		SingletonTestThread s2 = new SingletonTestThread("Thread 2");
		SingletonTestThread s3 = new SingletonTestThread("Thread 3");
		
		//Aufrufen der start()-Methode auf den Objekten von SingletonTestThread oder SingletonTestThread2 (je nach dem was ausgeklammert ist)
		s1.start();
		s2.start();
		s3.start();

	}

}
