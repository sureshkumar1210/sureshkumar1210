package arrys.patten;

public class Patern11 {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--) {
			for(int col=3;col>row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

}
