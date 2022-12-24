package arrys.practice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.println("enter a array length:");
		int length=sk.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("enter a value");
			arr[i]=sk.nextInt();
		}
		System.out.println("enter a key:");
		int key=sk.nextInt();
		for(int j=0;j<arr.length;j++) {
			if(key==arr[j]) {
				System.out.println("key is present:"+j);
				break;
			}
			else if(key!=arr[j])
				System.out.println("key is not present");
				break;
		}

	}

}
