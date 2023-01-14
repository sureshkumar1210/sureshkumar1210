package practice;

public class Lcm {

	public static void main(String[] args) {
		int n1=3;
		int n2=4;
		int max=n1>n2?n1:n2;
		while(true) {
			if(max%n1==0) {
				if(max%n2==0) {
					System.out.println(max);
					break;
				}
			}
			max++;
		}

	}

}
