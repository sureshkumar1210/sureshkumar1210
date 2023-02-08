package oops;

import java.util.Scanner;

public class Sum {
	Scanner sc=new Scanner(System.in);
	int c;
	void add(int a,int b) {
		System.out.println(c=a+b);
	}
	void sub(int a,int b) {
		System.out.println(c=a-b);
	}
	void mul(int a,int b) {
		System.out.println(c=a*b);
	}
	void div(int a,int b) {
		System.out.println(c=a/b);
	}
	public static void main(String[] args) {
		System.out.println("this is simple mathmetical function");
		Scanner sc=new Scanner(System.in);
		Sum sk=new Sum();
		System.out.println("how many times work in this function");
		int times=sc.nextInt();
		for(int i=0;i<times;i++) {
		System.out.println("1.add"+"\n"+"2.div"+"\n"+"3.mul"+"\n"+"4.div");
		System.out.println("Select option");
		int option=sc.nextInt();
		System.out.println("Enter first value");
		int a1=sc.nextInt();
		System.out.println("enter second value");
		int b1=sc.nextInt();
		switch(option) {
		case 1:
			sk.add(a1,b1);
			break;
		case 2:
			sk.sub(a1,b1);
			break;
		case 3:
			sk.mul(a1,b1);
			break;
		case 4:
			sk.div(a1,b1);
			break;
		default:
			System.out.println("Invalid option");
		}
		}	
		
	}

}
