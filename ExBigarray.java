package arrys.practice;

import java.util.Arrays;

public class ExBigarray {

	public static void main(String[] args) {
		int no[]= {10,20,30,40,70,90,40,76};
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<no.length;i++) {
			if(no[i]>temp) {
				temp=no[i];
			}
//			System.out.println(temp);
		}
		System.out.println(temp);

	}

}
