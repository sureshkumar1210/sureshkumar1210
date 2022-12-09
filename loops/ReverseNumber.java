package loops;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter a number");
	int no=sk.nextInt();
	int nocopy=no;
	while(no>0) {
		System.out.println(no%10);
		no=no/10;
	}
	}

}
