package arrys.patten;

public class Pattern5 {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}

}


//3 3 3 
//2 2 
//1 