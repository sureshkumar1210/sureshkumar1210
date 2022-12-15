package String;

public class CountofSentence {

	public static void main(String[] args) {
		String sk="haii i am sureshkumar. i am comming from chinnasalem.";
		int i=0;
		int j=sk.length();
		int count=0;
		while(i<j) {
			if(sk.charAt(i)=='.') {
				count++;
				
			}
			i=i+1;
		}
		System.out.println("how many sentence in this paragraph:"+"\n"+count);
	}

}
