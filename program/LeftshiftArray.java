package arrys.program;

import java.util.Arrays;

public class LeftshiftArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length]=temp;
		System.out.println(Arrays.toString(arr));
		}

	}
