package loo.ping;

public class Multiplenumbers {

	public static void main(String[] args) {
		int no=1;
		while(no<=25) {
			if(no%3==0) {
				System.out.println("multiple of 3:"+no);
			}
			else if(no%5==0) {
				System.out.println("multiple of 5.....:"+no);
			}
			no=no+1;
		}

	}

}
