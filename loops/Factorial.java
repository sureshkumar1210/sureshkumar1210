package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter factorial number");
		int no=sk.nextInt();
		int result=1;
		int nocopy=no;
		while(no>0) {
			result=result*no;
			no=no-1;
		}
		System.out.println("The factorial number is"+"\n"+nocopy+"!="+result);
	}

}
