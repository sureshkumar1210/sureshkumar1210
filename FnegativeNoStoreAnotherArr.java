package arrys.program;

public class FnegativeNoStoreAnotherArr {

	public static void main(String[] args) {
		int[] arr= {10,-20,30,-14,24,-12,35,67};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
			}
		int j=0;
		int[] negativearray=new int[count];
		for(int i=0;i<arr.length;i++) {
			negativearray[j]=arr[i];
			j++;
		}
		if(count==j) {
			System.out.println(negativearray[j]);
		
		}

	}

}
