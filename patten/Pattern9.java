package arrys.patten;

public class Pattern9 {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int col=2;col>=row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}

//  *           in sapce
// * * 
//* * *

//without sapce
//  *
// **
//***