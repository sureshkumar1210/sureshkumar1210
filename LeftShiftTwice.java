package arrys.program;

import java.util.Arrays;

public class LeftShiftTwice {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int temp1=arr[0];
		int temp2=arr[1];
		for(int i=0;i<arr.length-2;i++) {
			arr[i]=arr[i+2];
		}
		arr[arr.length-2]=temp2;
		arr[arr.length-1]=temp1;
		System.out.println(Arrays.toString(arr));
	}

}
