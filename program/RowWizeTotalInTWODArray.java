package arrys.program;

public class RowWizeTotalInTWODArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int val=1;
		int row=0;
		while(row<3) {
			int col=0;
			while(col<3) {
				arr[row][col]=val;
				val+=1;
				col++;
			}
			row++;
		}
		int total=0;
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				total=total+arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			System.out.println("Row total:"+total);
			
		}

	}

}
