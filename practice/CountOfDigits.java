package practice;

public class CountOfDigits {

	public static void main(String[] args) {
		int no=9876;
		int count=0;
		while(no>=1) {
			no=no/10;
			count++;
		}
		System.out.println("count of digits:"+count);

	}

}
