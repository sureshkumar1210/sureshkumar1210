package arrys.patten;

public class Pattern3 {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--) {
			for(int col=3;col>=row;col--) {
				System.out.print(row+" ");
			}
			
			System.out.println();
		}

	}

}


//3 
//2 2 
//1 1 1 