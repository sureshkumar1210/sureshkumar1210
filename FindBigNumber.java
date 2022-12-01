package arrys.program;

public class FindBigNumber {

	public static void main(String[] args) {
		int[] arr= {2,3,11,5,7,4,8,26,9,1};
		int len=arr.length;
		int temp=-2334;   //Integer-MIN-VALUE;
		for(int i=0;i<len;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
				System.out.println(temp);
			}
		}
		System.out.println("Big Number Is:"+temp);
	}

}
