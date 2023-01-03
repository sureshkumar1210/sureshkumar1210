package String;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		sb.append("suresh");
		System.out.println(sb);
		sb.insert(1,"A");
		sb.reverse();
		System.out.println(sb);
	}
	
		}

	