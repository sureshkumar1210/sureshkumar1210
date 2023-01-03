package String;

public class StringBufferdemo1 {

	public static void main(String[] args) {
		StringBuffer sk=new StringBuffer("hello");
		System.out.println(sk);
		sk.insert(sk.length(),"java"); //insert the string possiton
		System.out.println(sk);
		sk.append("kumar");				//join the string
		System.out.println(sk);
		System.out.println(sk.length());
		sk.replace(10,14, "developer");
		System.out.println(sk);
		sk.delete(0, 5);
		System.out.println(sk);
		sk.reverse();
		System.out.println(sk);
		sk.reverse();
		System.out.println(sk);
		System.out.println(sk.capacity());
		sk.ensureCapacity(10);
		System.out.println(sk);
		

	}

}
