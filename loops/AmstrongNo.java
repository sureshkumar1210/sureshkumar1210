package loops;
public class AmstrongNo {
	static int FindDigit(int no) {
		int digit=0;
		while(no>0) {
			no=no%10;
			digit=digit+1;
		}
		return digit;
	}
	static int powerno(int no,int digit) {
		int result=1;
		while(digit>0) {
			result=result*no;
			digit=digit-1;
		}
		return result;
	}

	public static void main(String[] args) {
		int no=145;
		int nocopy=no;
		int digit=FindDigit(no);
		int result=0;
		while(no>0) {
			result=result+powerno(no%10,digit);
			no=no/10;
			System.out.println(result);
		}
		
		if(nocopy==result) {
			System.out.println("this is amstrong number:"+"/n"+result);
		}
		else {
			System.out.println("not amstrong:"+"/n"+result);
		}
	}
}
