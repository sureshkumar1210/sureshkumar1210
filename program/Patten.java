package arrys.program;

public class Patten {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col +" ");
			}
			for(int star=1; star<=row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
 }