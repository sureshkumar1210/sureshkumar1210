package arrys.patten;

public class Patten1 {
	public static void main(String[] args){
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			for(int col=4;col>=row;col--) {
				System.out.print("  ");
			}
			for(int col=4;col>=row;col--) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int col=6-row;col>=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
