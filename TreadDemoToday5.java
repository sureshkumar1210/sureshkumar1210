package multithreading;

public class TreadDemoToday5 {

	public static void main(String[] args)throws InterruptedException{
		Thread t1=new Threadclass();
		Thread t2=new Threadclass();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t2.setPriority(10);
		System.out.println("t1"+t1.getPriority());
		System.out.println("t2"+t2.getPriority());
		t1.join();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

}
