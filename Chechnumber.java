package practice;

public class Chechnumber {

	public static void main(String[] args) {
		String s="suree007";
		char[] ch=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char c: ch) {
			if(Character.isDigit(c))
			sb.append(c);
		}
		System.out.println(sb);
	}

}
