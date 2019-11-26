package singleton;

public class Main {

	public static void main(String[] args) {
		/*SingletonTestThread2 s1 = new SingletonTestThread2("Thread 1");
		SingletonTestThread2 s2 = new SingletonTestThread2("Thread 2");
		SingletonTestThread2 s3 = new SingletonTestThread2("Thread 3");*/
		
		SingletonTestThread s1 = new SingletonTestThread("Thread 1"); //TTM3 (synchronized)
		SingletonTestThread s2 = new SingletonTestThread("Thread 2");
		SingletonTestThread s3 = new SingletonTestThread("Thread 3");
		
		s1.start();
		s2.start();
		s3.start();

	}

}
