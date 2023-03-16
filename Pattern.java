package practice;

public class Pattern {

	public static void main(String[] args) {
		int no=9;
		for(int row=0;row<5;row++) {
			for(int col=4;col>=row;col--) {
				System.out.print("  ");
			}
			for(int col=0;col<=row;col++) {
				System.out.print(no+" ");
			}
			no=no-2;
			System.out.println();
		}

	}

}
