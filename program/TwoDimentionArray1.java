package arrys.program;

import java.util.Scanner;

public class TwoDimentionArray1 {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int row=0;
		while(row<3) {
			int col=0;
			while(col<3) {
				System.out.println("Enter 2d array");
				arr[row][col]=sk.nextInt();
				col++;
			}
			row++;
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
