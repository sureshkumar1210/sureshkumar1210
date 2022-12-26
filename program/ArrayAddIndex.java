package arrys.program;

import java.util.Arrays;

public class ArrayAddIndex {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int addsize=arr.length/2;
		int[] arr1=new int[addsize];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			arr1[j]=arr[i];
			j++;
		}
		}
	}

}
