package practice;

public class StringSort {

	public static void main(String[] args) {
		String s="sureshkumar";
		s=s.toLowerCase();
		char[] ar=s.toCharArray();
		int i=0;
		while(i<ar.length) {
			int j=i+1;
			while(j<ar.length) {
				if(ar[i]>ar[j]) {
					char temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(ar);

	}

}
