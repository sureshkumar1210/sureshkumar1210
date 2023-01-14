package practice;

public class DecimalToBinary {
	static void reverse(String word) {
		int len=word.length()-1;
		String output="";
		while(len>=0) {
			output=output+word.charAt(len);
			len--;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		int no=10;
		String reverse="";
		while(no>=1) {
			reverse=reverse+no%2;
			
			no=no/2;
		}
		reverse(reverse);
		

	}

}
