package arrys.program;

public class FirstTwoGreatedNumber {

	public static void main(String[] args) {
		int[] arr= {2,5,-4,7,1,-2};
		int len=arr.length;
		int min1=1;
		int min2=2;
		for(int i=0;i<len;i++) {
			if(arr[i]>min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]>min2){
				min2=arr[i];
				
			}
		}
			System.out.println(min1+" "+min2);

	}

}
