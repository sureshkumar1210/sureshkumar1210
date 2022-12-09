package loops;

public class FibonacciSeries {    //0,1,1,2,3,5,7,12,19

	public static void main(String[] args) {
		int f=0;
		int s=1;
		int t=0;
		int no=10;
		System.out.print(f+" "+s);
		while(no>0) {
			t=f+s;
			f=s;
			s=t;
			no=no-1;
			System.out.print(" "+t);
		}
		

	}

}
