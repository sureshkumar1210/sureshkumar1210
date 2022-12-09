package loops;
import java.util.Scanner;
public class PrintingElevanOrder {

	public static void main(String[] args) {
		Scanner Sk=new Scanner(System.in);
		System.out.println("enter a number");
		int no=Sk.nextInt();
		System.out.println("Enter the limit of number:");
		int limit=Sk.nextInt();
		System.out.println("enter the multiple number:");
		int multi=Sk.nextInt();
		while(no<=limit) {
			System.out.println(no);
			no=no*multi;
		}

	}

}
