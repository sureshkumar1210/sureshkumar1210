package practice;

public class AddAndEvenIndex {

	public static void main(String[] args) {
		String name="suresh";
		int len=name.length()-1;
		int i=0;
		while(i<=len) {
			if(i%2==0) {
				System.out.println("even index:"+name.charAt(i));
			}
			else {
				System.out.println("add index:"+name.charAt(i));
			}
			i++;
		}

	}

}
