package exceptionHandling;

import java.util.Scanner;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		Exceptiondemo1 sk=new Exceptiondemo1();
		sk.division();
		sk.add();

	}

	private void add() {
		Scanner sk=new Scanner(System.in);
		System.out.println("enter a number:");
		int no1=sk.nextInt();
		int no2=sk.nextInt();
		int result=no1+no2;
		System.out.println("addition result:"+result);
		
	}

	private void division() {
		Scanner sk=new Scanner(System.in);
		System.out.println("enter a number:");
		int no1=sk.nextInt();	//5
		int no2=sk.nextInt();	//0
		try {
		int result=no1/no2;		//5/0=infinity
		System.out.println("division result:"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("no2 is zero.please check no2 value");
			division();
		}
		
	}

}
