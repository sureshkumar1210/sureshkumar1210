package arrys.program;

import java.util.Arrays;

public class TransposeMatrixTwoDArray {

	public static void main(String[] args) {
		int ar[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int trans[][]=new int[3][3];
		int row=0;
		while(row<3) {
			int col=0;
			while(col<3) {
				trans[row][col]=ar[col][row];
				col++;
			}
			row++;
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}

	}

}
