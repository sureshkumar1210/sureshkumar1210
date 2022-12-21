package arrys.practice;

import java.util.Arrays;

public class ExLeftshift {

	public static void main(String[] args) {
		int no[]= {10,20,30,40,50};
		int temp=no[0];
		for(int i=0;i<no.length-1;i++) {
			no[i]=no[i+1];
		}
		no[no.length-1]=temp;
		System.out.println(Arrays.toString(no));

	}

}
