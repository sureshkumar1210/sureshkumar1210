package looping;

public class Gcd {

	public static void main(String[] args) {
		int no1=15;
		int no2=30;
		int min=no1>no2?no2:no1;
		while(min>1) {
			if(no1%min==0) {
				if(no2%min==0) {
					System.out.println(min);
					System.out.println("min");
					break;
				}
			}
			min=min-1;
			
		}

	}

}
