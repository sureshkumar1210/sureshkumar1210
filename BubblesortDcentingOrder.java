package arrys.practice;

public class BubblesortDcentingOrder {

	public static void main(String[] args) {
		int ar[]= {20,10,30,50,40,60};
		int j=1;
		while(j<ar.length) {
			int i=0;
			while(i<ar.length-j) {
				if(ar[i]<ar[i+1]) {
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
				i++;
			}
			j++;
		}
		for(int k=0;k<ar.length;k++) {
			System.out.println(ar[k]);
		}

	}

}
