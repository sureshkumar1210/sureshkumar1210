package arrys.program;

import java.util.Arrays;

public class TwoDimentionArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int value=5;
		int row=0;
		while(row<3) {
			int col=0;
			while(col<3) {
				arr[row][col]=value;
				value+=5;
				col++;
			}
			row++;
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
	}

}
