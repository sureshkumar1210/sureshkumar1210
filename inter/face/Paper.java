package inter.face;

public class Paper implements Printable{
	public void print() {
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
	     Paper sk=new Paper();
	     	sk.print();
	}

}
