package loops;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sk.nextInt();
		int add=0;
		int multi=1;
		while(no>0) {
			add=add+no%10;
			multi=multi*no%10;
			no=no/10;
		}
		if(add==multi) {
			System.out.println("This is spy number:"+add+"=="+multi);
		}
		else {
			System.out.println("This is not spy number:"+add+"=="+multi);
		}
	}

}
