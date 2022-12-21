package arrys.practice;

import java.util.Arrays;

public class ExRightShift {

	public static void main(String[] args) {
		int no[]= {10,20,30,40,50};
		int temp=no[no.length-1];
		for(int i=no.length-1;i>0;i--) {
			no[i]=no[i-1];
		}
		no[0]=temp;
		System.out.println(Arrays.toString(no));

	}

}
