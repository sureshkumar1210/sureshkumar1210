package arrys.patten;

public class DimondPattern {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int col=2;col>=row;col--) {
				System.out.print(" ");			//space
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			for(int col=1;col<row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		for(int row=1;row<=3;row++) {
			for(int col=1;col<row;col++) {
				System.out.print(" ");
			}
			for(int col=3;col>=row;col--) {
				System.out.print(col);
			}
			for(int col=2;col>=row;col--) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

}

//	  1
//   121
//  12312
//  32121
//   322
//    3
								
																
															
															
																
																		