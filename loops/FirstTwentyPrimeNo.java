package loops;

public class FirstTwentyPrimeNo {

	public static void main(String[] args) {
		for(int no=2;no<=100;no++) {
			int div=2;
			int count=0;
			if(no<1) {
				System.out.println("not prime");
			}
			else {
			while(div<=no/2) {
				if(no%div==0) {
					count=count+1;
					break;
				}
				div=div+1;
			}
		}
			if(count==0) {
				System.out.println("this is prime"+no);
			}
	}
	}
}
