package arrys.program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RightShift {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int temp=arr[0];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			System.out.println(arr[i]);
		}
		arr[0]=temp;
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	  }
	}
