package loo.ping;

public class ThreeFive {

	public static void main(String[] args) {
		int no=1;
		while(no<=50) {
			if(no%3==0) {
				System.out.println("multiple of three...:"+no);
			}
				if(no%5==0) {
					System.out.println("multiple of five:"+no);
				}
			
			no=no+1;
		}

	}

}
