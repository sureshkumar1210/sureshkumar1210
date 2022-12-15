package String;

public class Stringmethods {

	public static void main(String[] args) {
		String sk=" sureshkumar ";
		System.out.println(sk);
		System.out.println(sk.length());
		System.out.println(sk.contains("h"));
		System.out.println(sk.endsWith("ar "));
		System.out.println(sk.startsWith(" su"));
		String s=sk.trim();
		System.out.println(s);
		System.out.println(s.length());
	}

}
