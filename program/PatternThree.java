package arrys.program;

public class PatternThree {

	public static void main(String[] args) {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row-1;col++) {
				System.out.print(col+" ");
			}
			for(int star=1; star<=6-row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
