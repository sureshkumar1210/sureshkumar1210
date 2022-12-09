package loops;
import java.util.Scanner;
public class PrintAddandEvenNumber {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter a number");
		int No=sk.nextInt();
		System.out.println("limit of Number");
		int times=sk.nextInt();
		while(No<=times) {
			if(No%2==0) {
		System.out.println("even Number..:"+No);
		}
			else{
				System.out.println("add no is.....:"+No);
			}
		No=No+1;	
	}
	}
}

