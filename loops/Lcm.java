package loops;

public class Lcm {

	public static void main(String[] args) {
		int no1=3;
		int no2=4;
		int max=(no1>no2)?no1:no2;
		while(max>1) {
			if(max%no1==0) {
				if(max%no2==0) {
					System.out.println(max);
					break;
				}
			}
			max=max+1;
		}
	}

}
