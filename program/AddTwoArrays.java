package arrys.program;

public class AddTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {15,35};
		int bigindex=arr1.length>arr2.length?arr1.length:arr2.length;
		int[] arr3=new int[bigindex];
		for(int i=0;i<bigindex;i++) {
			if(i<arr1.length) {
				arr3[i]=arr1[i];
			}
			if(i<arr2.length) {
				arr3[i]=arr3[i]+arr2[i];
			}
			System.out.println(arr3[i]);
		}
		
	}

}
