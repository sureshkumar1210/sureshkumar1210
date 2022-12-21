package arrys.practice;

import java.util.Arrays;

public class ExnegativeArray {

	public static void main(String[] args) {
		int no[]= {10,20,30,-2,-5,-8};
		int count=0;
		for(int i=0;i<no.length;i++) {
			if(no[i]<0) {
				count=count+1;
			}
		}
		int j=0;
		int negative[]=new int[count];
		for(int i=0;i<no.length;i++) {
			if(no[i]<0) {
				negative[j]=no[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(negative));
	}

}
