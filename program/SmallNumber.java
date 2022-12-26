package arrys.program;

public class SmallNumber {

	public static void main(String[] args) {
		int[] arr= {1,5,7,9,4,6};
		int len=arr.length;
		int temp=Integer.MAX_VALUE;
		for(int i=0;i<len;i++) {
			if(arr[i]<temp) {
				temp=arr[i];
			}
		}
		System.out.println("small no is:"+temp);
	}

}
