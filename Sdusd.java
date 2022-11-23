public class Sdusd{  //sum of digit untill single digit

	public static void main(String[] args) {
		int n=124;
		int total=n;
		while(total>9) {
			total=0;
			while(n>0) {
				total=total+n%10;
				n=n/10;
			}
			n=total;
		}
		System.out.println(total);
	}
	}
