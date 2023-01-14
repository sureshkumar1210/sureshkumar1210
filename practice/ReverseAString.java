package practice;

public class ReverseAString {

	public static void main(String[] args) {
		String sk="suresh";
		String reverse=" ";
		int len=sk.length()-1;
		while(len>=0) {
			reverse=reverse+sk.charAt(len);
			len--;
	}
	if(sk.equals(reverse)) {
		System.out.println("this is plaindrome:"+reverse+"\n"+sk);
	}
	else {
		System.out.println("this is plaindrome:"+reverse+"\n"+sk);
	}
  }
}
