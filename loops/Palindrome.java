package loops;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter a name");
		String name=sk.next();
		int len=name.length()-1;
		String name1="";
		while(len>=0) {
			name1=name1+name.charAt(len);
			len=len-1;
		}
		if(name.equals(name1)) {
			System.out.println("this is palindrome"+"\n"+name1);
		}
		else {
			System.out.println("not palindrome"+"\n"+name1);
		}

	}
}
