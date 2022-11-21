package looping;

public class SwapNumbers {

	public static void main(String[] args) {
		int n1=15;
		int n2=25;
		System.out.println("n1="+n1+"  "+"n2="+n2);
		n2=n2+n1;
		n1=n2-n1;
		n2=n2-n1;
		System.out.println("n1="+n1+"  "+"n2="+n2);

	}

}
