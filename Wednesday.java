package practice;

import java.util.Arrays;

public class Wednesday {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50};
		int len=ar.length-1;
		for(int i=0;i<=len;i++) {
			int temp=ar[i];
			ar[i]=ar[len];
			ar[len]=temp;
			len--;
		}
		System.out.println("reverse Same array:"+Arrays.toString(ar));
		int br[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			br[i]=ar[i];
		}
		System.out.println("Store another array:"+Arrays.toString(br));
		int rev[]=new int[ar.length];
		int j=ar.length-1;
		for(int i=0;i<=ar.length-1;i++) {
			rev[i]=ar[j];
			j--;
		}
		System.out.println("reverse array:"+Arrays.toString(rev));
		
		int min=Integer.MIN_VALUE;
		for(int i=0;i<rev.length;i++) {
			if(rev[i]>min) {
				min=rev[i];
			}
		}
		System.out.println("big an index:"+min);
		
		int max=Integer.MAX_VALUE;
		for(int i=0;i<rev.length;i++) {
			if(rev[i]<max) {
				max=rev[i];
			}
		}
		System.out.println("small an index"+max);
		
		int max1=Integer.MAX_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<rev.length;i++) {
			if(rev[i]<max1) {
				max1=rev[i];
			}
			if(rev[i]>max2) {
				max2=rev[i];
			}
		}
		System.out.println("small an index:"+max1+", big an index:"+max2);
	}

}
