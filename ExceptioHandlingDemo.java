package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptioHandlingDemo {

	public static void main(String[] args) {
		ExceptioHandlingDemo sk=new ExceptioHandlingDemo();
		sk.div();
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

	private void div() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		try {
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int result=no1/no2;
		System.out.println("div value:"+result);
		}
		catch(InputMismatchException ime)
		{
		System.out.println("please enter interger value!");
		div();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("no2 is zero.please check no2 value");
			div();
		}
		catch(Exception e) {
			System.out.println("unknown reasons");
			div();
		}
		finally
		{
			System.out.println("finally block");
		}
		
	
	}
}
