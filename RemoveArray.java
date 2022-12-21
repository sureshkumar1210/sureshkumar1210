package arrys.practice;

import java.util.Arrays;

public class RemoveArray {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50,60};
		int removearray[]=new int[array.length-1];
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(i!=2) {
				removearray[j]=array[i];
				j++;
				System.out.println(array[i]);
			}
			System.out.println(Arrays.toString(removearray));
		}

	}

}
