package arrys.patten;

public class LetterWithStar {

	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row==1||row==(n/2)+1||col==1||col==n)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
			
		}

	}

}
