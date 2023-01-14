package practice;

public class Fibonacciprime {

	public static void main(String[] args) {
		int no=100;
		int f=0,s=1,t=0;
		while(t<=no) {
			t=f+s;
			f=s;
			s=t;
			int div=2;
			int count=0;
			while(div<=t/2) {
				if(t%div==0) {
					count++;
					break;
				}
				div++;
			}
			if(count==0) {
				System.out.println("fibonachiprime:"+t);
			}
		}

	}

}
