package arrys.practice;

public class ExBigTwoNo {

	public static void main(String[] args) {
		int arr[]= {10,20,25,46,2,5,6};
		int min=Integer.MIN_VALUE;
		int min1=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min) {
				min1=min;
				min=arr[i];
			}
			else if(arr[i]>min1) {
				min1=arr[i];
			}
		}
		System.out.println(min+" "+min1);

	}

}
