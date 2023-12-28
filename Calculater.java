package fist;

import java.util.Scanner;

public class Calculater {
	 
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println("The addition value is :"+c);
	}
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println("The subtraction value is :"+c);
	}
	public static void mul(int a,int b) {
		int c=a*b;
		System.out.println("The multiple value is :"+c);
	}
	public static void div(int a,int b) {
		int c=a/b;
		System.out.println("the division value is :"+c);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to java simple calculater function");
		System.out.println("____________________________________________");
		System.out.println("Enter The Values");
		System.out.println("____________________________________________");
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter second value");
		int b=sc.nextInt();
		System.out.println("____________________________________________");
		System.out.println("        Select option");
		System.out.println("____________________________________________");
		System.out.println("1.Addition");
		System.out.println("2.substraction");
		System.out.println("3.Multilple");
		System.out.println("4.Division");
		System.out.println("____________________________________________");
		int option =sc.nextInt();
		switch(option) {
		case 1:
			add(a,b);
			break;
		case 2:
			sub(a,b);
			break;
		case 3:
			mul(a,b);
			break;
		case 4:
			div(a,b);
			break;
		default :
			System.out.println("Invalid option ! pls enter correct option");
			break;
		}

	}

}
