package arrys.practice;

public class Binarysearch {

	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50,60};
		int min=0,max=ar.length;
		int key=30;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==ar[mid]) {
				System.out.println("key is present:"+mid);
				break;
			}
			else if(key<ar[mid]) {
				max=mid-1;
			}
			else {
				min=mid+1;
			}
		}
		if(min>max)
			System.out.println("key is not present");
	}

}
