package arrys.program;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {50,60,30,70,40};
		int j=1;
		while(j<arr.length) {
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
				}
			j++;
			}
		System.out.println(Arrays.toString(arr));
		}

	}
