package practice;

public class ReverseNo {

	public static void main(String[] args) {
		int no=545;
		int nocopy=no;
		String reverse="";
		while(no>=1) {
			reverse=reverse+no%10;
			no=no/10;
		}
		System.out.println(reverse);
		int no1=Integer.parseInt(reverse);
		System.out.println(no1);
		if(nocopy==no1) {
			System.out.println("this is palindrome");
		}
	}

}
