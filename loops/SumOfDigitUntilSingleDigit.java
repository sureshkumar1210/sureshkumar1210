package loops;

public class SumOfDigitUntilSingleDigit {

	public static void main(String[] args) {
		int no=98765;
		int total=no;
		while(total>9) {
			no=total;
			total=0;
			while(no>0) {
				total=total+no%10;
				no=no/10;
			}
			System.out.println(total);
		}
		System.out.println(total);
	}

}
