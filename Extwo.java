package arrys.practice;

import java.util.Arrays;

public class Extwo {

	public static void main(String[] args) {
		int no[]= {10,20,30,40,60,70};
		int store[]=new int[no.length/2];
		int j=0;
		for(int i=0;i<no.length;i++) {
			if(i%2==0) {
				System.out.println("even index no of array...:"+no[i]);
				store[j]=no[i];
				//System.out.println(store[j]);
				j++;
			}else {
				System.out.println("add index no of array:"+no[i]);
			}
			//System.out.println(Arrays.toString(store));
		}
		System.out.println("Store another array:");
		System.out.println(Arrays.toString(store));
	}

}
