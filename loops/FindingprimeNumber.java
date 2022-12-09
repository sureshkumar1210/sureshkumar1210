package loops;

public class FindingprimeNumber {

	public static void main(String[] args) {
		int no=17;
		int div=2;
		int count=0;
		if(1>=no) {
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
			System.out.println("this is prime:"+no);
			}
		else {
			System.out.println("this is not prime"+no);
		}
	}
}
