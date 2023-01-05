package multithreading;

public class ThreadToday5 {

	public static void main(String[] args) {
		Thread t1=new Threadclasstoday5();
		System.out.println("before start():"+t1);
		t1.start();
		System.out.println("after start():"+t1.getState());
		System.out.println(t1.getState());
		while(t1.isAlive()) {
			//System.out.println("afterSleep:"+t1.getState());
		}
		System.out.println("after dead"+t1.getState());

	}

}
