package loops;

public class SwapNumber {

	public static void main(String[] args) {
		int no1=10;
		int no2=20;
		System.out.println(no1+" "+no2);
		no2=no1+no2;
		no1=no2-no1;
		no2=no2-no1;
		System.out.println(no1+" "+no2);
	}

}
