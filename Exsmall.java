package arrys.practice;

public class Exsmall {

	public static void main(String[] args) {
		int no[]= {10,20,59,5,49,67};
		int temp=Integer.MAX_VALUE;
		for(int i=0;i<no.length;i++) {
			if(no[i]<temp) {
				temp=no[i];
			}
		}
		System.out.println(temp);
	}

}
