package arrys.practice;

public class Bubblesort {

	public static void main(String[] args) {
		int ar[]= {20,10,40,30,50};
		int j=1;
		while(j<ar.length) {
			int i=0;
			while(i<ar.length-j) {
				if(ar[i]>ar[i+1]) {
					int temp=ar[i];
				    ar[i]=ar[i+1];
				    ar[i+1]=temp;
			}
			i=i+1;
		}
		j=j+1;
		}
		for(int k=0;k<ar.length;k++) {
			System.out.println(ar[k]);
		}
	}
	
}
