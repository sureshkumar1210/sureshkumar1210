package arrys.practice;

import java.util.Arrays;

public class ExReverse {

	public static void main(String[] args) {
		int no[]= {10,20,30,40,50,60};
		int j=no.length-1;
		for(int i=0;i<j;i++) {
			int temp=no[i];
			no[i]=no[j];
			no[j]=temp;
			j--;
		}
	System.out.println(Arrays.toString(no));
}
}
