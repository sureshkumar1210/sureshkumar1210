package loops;

public class BinaryToDecimal {
	static int power(int no,int times) {
		int result=1;
		while(times>0) {
			result=result*no;
			times=times-1;
		}
		return result;
	}

	public static void main(String[] args) {
		int no=1010;
		int power=0;
		int result=0;
		while(no>0) {
			int last=no%10;
			result=result+(last*power(2,power));
			no=no/10;
			power=power+1;
			
		}
		System.out.println(result);
	}
}
