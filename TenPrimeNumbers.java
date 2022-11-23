public class TenPrimeNumbers {
	static int prime(int no) {
		    int div=2;
	        int count=0;
	    if(no<=1){
	            System.out.println("Not prime");
	            }
	    else{
	        while(div<=no/2){
	            if(no%div==0){
	                System.out.println("not prime");
	                count=1;
	                break;
	               }
	                div++;
	               }
	             System.out.println(div);
//	        if(count==0){
//	            System.out.println("this is prime");
//	            }
//	            else{
//	            System.out.println("not prime");
//	          
//	        }
	}
	    return no;
	}

	public static void main(String[] args) {
		System.out.println(2);
		int count=10;
		count=count-1;
		int no=3;
		while(count>0) {
			if(prime(no)>=0) {
				count=count-1;
			}
			no=no+1;
		}

	}

}

