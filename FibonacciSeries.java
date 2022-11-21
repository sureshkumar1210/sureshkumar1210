package looping;
public class FibonacciSeries {

	public static void main(String[] args) {
		int f=0;
		int s=1;
		int t=0;
		int no=10;
		no=no-1;
		System.out.println(f+"\n"+s);
		while(no>0) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			no=no-1;
		}
	}

}
