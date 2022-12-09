package loops;
import java.util.Scanner;
public class StrongNumber {
	static int Factorial(int no) {
		int fact=1;
		while(no>0) {
			fact=fact*no;
			no=no-1;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sk.nextInt();
		int nocopy=no;
		int result=0;
		while(no>0) {
			result=result+Factorial(no%10);
			no=no/10;
		}
		if(nocopy==result) {
			System.out.println("this is strong number"+"\n"+result);
		}
		else {
			System.out.println("this is not strong"+"\n"+result);
		}
	}
}
