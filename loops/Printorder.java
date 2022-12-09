package loops;

public class Printorder {    //1*2 2*3 3*4 4*5 5*6

	public static void main(String[] args) {
		int no=1;
		while(no<6) {
		System.out.println(no+"*"+(no+1));
			no=no+1;
	}
}
}