package looping;

public class PrimeNumber {

	public static void main(String[] args) {
		 int no=17;
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
	        if(count==0){
	            System.out.println("this is prime");
	            }
	            else{
	            System.out.println("not prime");
	          
	        }
	}

	}

}
