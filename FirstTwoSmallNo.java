package arrys.program;

public class FirstTwoSmallNo {

	public static void main(String[] args) {
		int[] arr= {3,6,8,9,4,6,15,14,17};
		int len=arr.length;
		int max1=10;
		int max2=20;
		for(int i=0;i<len;i++) {
			if(arr[i]<max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]<max2) {
				max2=arr[i];
			}
		}
		System.out.println(max1+" "+max2);

	}

}
