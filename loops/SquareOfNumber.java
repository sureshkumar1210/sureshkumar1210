package loops;

public class SquareOfNumber {

	public static void main(String[] args) {
		int no=1;
		while(no<=5) {
			int times=no;
			int result=1;
			while(times>0) {
				result=result*no;
				times=times-1;
			}
			no=no+1;
			System.out.println(result);
		}

	}

}
