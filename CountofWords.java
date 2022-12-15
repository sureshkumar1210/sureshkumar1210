package String;

public class CountofWords {

	public static void main(String[] args) {
		String sk=new String("suresh kumar kumar");
		int i=0;
		int j=sk.length();
		int count=0;
		while(i<j) {
			if(sk.charAt(i)==' ') {
				count=count+1;
				
			}
			i=i+1;
		}
		System.out.println("no.of words:"+count);
	}

}
