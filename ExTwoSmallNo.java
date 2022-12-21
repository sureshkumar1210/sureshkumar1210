package arrys.practice;

public class ExTwoSmallNo {

	public static void main(String[] args) {
		int arr[]= {20,30,40,15,17,18};
		int max=Integer.MAX_VALUE;
		int max1=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max) {
				max1=max;
				max=arr[i];
			}
			else if(arr[i]<max1) {
				max1=arr[i];
				}
		}
		System.out.println(max+" "+max1);
	}

}
