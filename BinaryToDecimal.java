package looping;

public class BinaryToDecimal {
	 static int mathpower(int no,int times){
	        int result=1;
	        while(times>=1){
	            result=result*no;
	            times=times-1;
	         }
	        return result;
	        }
	    public static void main(String[] args){
	        int no=1011;
	        int p=0;
	        double result=0;
	        while(no>0){
	            int last=no%10;
	            result=result+(last*mathpower(2,p));
	            no=no/10;
	            p=p+1;
	        }
	       System.out.println(result);

}
}
