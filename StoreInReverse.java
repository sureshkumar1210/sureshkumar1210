package arrys.program;

import java.util.Arrays;

public class StoreInReverse {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int j=a.length-1;
		for(int i=0;i<j;i++) {
			int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j--;
		}
		System.out.println(Arrays.toString(a));
	}

}
