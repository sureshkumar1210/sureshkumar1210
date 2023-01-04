package multithreading;

public class Multithreaddemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadclassEx t=new ThreadclassEx();
		System.out.println("current class and object class also run at same time");
		System.out.println("it's work on thread in start() method");
		System.out.println("its only work on objects class in @override methods in thread class");
		t.setName("class");
		t.start();
		RunnableEx r=new RunnableEx();
		Thread t2=new Thread(r);
		t2.setName("interface");
		t2.start();

	}

}
