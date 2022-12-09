package loops;

public class ReverseString {

	public static void main(String[] args) {
		String name="sureshkumar";
		int len=name.length()-1;
		while(len>=0) {
			System.out.println(name.charAt(len));
			len=len-1;
		}

	}

}
