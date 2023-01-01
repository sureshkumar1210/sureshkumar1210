package arrys.patten;

public class Pattern1 {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++) { //row start with 1 that's why row value declare 1
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}

//				1
//				2 2
//				3 3 3