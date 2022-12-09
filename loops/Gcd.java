package loops;

public class Gcd {

	public static void main(String[] args) {
	int n1=100;
	int n2=1000;
	while(n1!=n2) {
		if(n1>n2) {
			n1=n1-n2;
			System.out.println("n1:"+n1);
		}
		else {
			n2=n2-n1;
			System.out.println("n2:"+n2);
		}
	}
	System.out.println("Gcd of n1 ans n2 is:"+n2);
	}

}
