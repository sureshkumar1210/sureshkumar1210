package String;

public class stringIsimmutable {

	public static void main(String[] args) {
		String s1="tamilnadu";
		String s2="tamilnadu";
		String s3="tamilnadu";
		String s4="tamilnadu";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		s1="kerala";
		System.out.println(s1.hashCode());

	}

}
