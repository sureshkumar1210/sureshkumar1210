package loops;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sk.nextInt();
		int squre=no*no;
		int result=0;
		while(squre>0) {
			result=result+squre%10;
			squre=squre/10;
		}
		if(result==no) {
			System.out.println("this is Neon number"+"\n"+result);
		}
		else {
			System.out.println("this is not neon number"+"\n"+result);
		}
	}

}
