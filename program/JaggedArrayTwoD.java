package arrys.program;

public class JaggedArrayTwoD {

	public static void main(String[] args) {
		int arr[][]=new int[2][];
		arr[0]=new int[5];
		arr[1]=new int[7];
		int val=1;
		int row=0;
		while(row<arr.length) {
			int col=0;
			while(col<arr[row].length) {
				arr[row][col]=val;
				val++;
				col++;
			}
			row++;
		}
		int total=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total=total+arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			System.out.println(total);
		}
}

}
