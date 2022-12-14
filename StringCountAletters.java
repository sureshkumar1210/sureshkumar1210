package String;

public class StringCountAletters {

	public static void main(String[] args) {
		String sk= new String("sureshkumar");
		int j=sk.length();
		int i=0;
		int count=0;
		while(i<j) {
			char ch=sk.charAt(i);
			if(ch=='u') {
				System.out.println(ch);
				count=count+1;
			}
			i=i+1;
		}
		System.out.println("how many times return the letter u:"+"\n"+count);

	}

}
