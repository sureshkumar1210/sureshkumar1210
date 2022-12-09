package loops;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sk.nextInt();
		int div=1;
		int result=0;
		while(div<=no/2) {
			if(no%div==0) {
				result=result+div;
			}
			div=div+1;
		}
		if(no==result) {
			System.out.println("This is perfect no:"+"\n"+result);
		}
		else {
			System.out.println("This is not perfect no:"+"\n"+result);
		}
	}

}
