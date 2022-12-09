package loops;
import java.util.Scanner;
public class PowerNumber {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sk.nextInt();
		System.out.println("Enter power number");
		int times=sk.nextInt();
		int result=1;
		while(times>0) {
			result=result*no;
			times=times-1;
		}
		System.out.println(result);
	}

}
