package loops;

public class PrintinOrder {     //1,2,4,7,11,16

	public static void main(String[] args) {
		int no=1;
		int result=1;
		while(result<=100) {
			System.out.println(result);
			result=result+no;
			no=no+1;
		}

	}

}
