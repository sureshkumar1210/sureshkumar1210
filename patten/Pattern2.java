package arrys.patten;

public class Pattern2 {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
	
//
//				1
//				1 2
//				1 2 3