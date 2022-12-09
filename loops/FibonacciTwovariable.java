package loops;

public class FibonacciTwovariable {

	public static void main(String[] args) {
		int f=-1;
		int s=1;
		int count=1;
		while(count<=5) {
			System.out.println(f+s);
			s=f+s;
			f=s-f;
			count=count+1;
	}
	}
}
