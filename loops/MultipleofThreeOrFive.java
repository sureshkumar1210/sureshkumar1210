package loops;

public class MultipleofThreeOrFive {

	public static void main(String[] args) {
		int no=1;
		while(no<=100) {
			if(no%3==0) {
				System.out.println("multiple of three..:"+no);
			}
			else if(no%5==0) {
				System.out.println("multiple of five......:"+no);
			}
			no=no+1;
		}

	}

}
