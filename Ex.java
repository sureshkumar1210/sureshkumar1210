package oops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many number's checking");
	int no1=sc.nextInt();
	for(int j=1;j<no1;j++) {
	System.out.println("Enter a number");
	int no=sc.nextInt();
	LinkedList<Integer> sk=new LinkedList();
	for(int i=1;i<100;i++) {
		if(no%i==0) {
			sk.add(i);
		}
		
	}
	System.out.println(sk);
	}
	}
}
