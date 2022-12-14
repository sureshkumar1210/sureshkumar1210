package String;

public class StringFindVowels {

	public static void main(String[] args) {
		String sk=new String("sureshkumar");
		int i=0;
		int j=sk.length();
		int count=0;
		while(i<j) {
			char ch=sk.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='v') {
				count=count+1;
			}
			i=i+1;
		}
		System.out.println("how mant letters vowels in this name:"+"\n"+count);
	}

}
