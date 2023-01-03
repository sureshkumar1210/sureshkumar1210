package String;

public class StringBuilderdemo {

	public static void main(String[] args) {
		StringBuilder sk=new StringBuilder("java");
		System.out.println(sk.capacity());
		System.out.println(sk.length());
		System.out.println(sk);
		sk.append("developer-");
		System.out.println(sk);
		sk.insert(0, "fullstack:");
		System.out.println(sk);
		System.out.println(sk.length());
		sk.insert(sk.length(),"mr.sureshkumar");
		System.out.println(sk);
		System.out.println(sk.length());
		sk.replace(0, 4, "Software");
		System.out.println(sk);
		StringBuffer ap=new StringBuffer("java");
		System.out.println(ap.equals(sk));

	}

}
