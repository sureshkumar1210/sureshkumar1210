package String;

public class Basic {
	public static void main(String[] args) {
		String s1=new String("abc");
		System.out.println(s1);
		String s12=("abc");
		System.out.println(s12);
		String s="asdf";
		System.out.println(s.hashCode());
		s="lkjh";
		System.out.println(s.hashCode());
	}

}
