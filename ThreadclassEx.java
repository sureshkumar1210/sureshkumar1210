package multithreading;

public class ThreadclassEx extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public void print() {
		System.out.println("print method");
	}

}
