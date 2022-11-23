class FibonacciPrime{

    public static void main(String[] args){ 
        int no=10;
        int f=1,s=1,t=0;
    while(t<=no){
        t=f+s;
        f=s;
        s=t;
        
        int div=2;
        int isprime=1;
    while(div<=t/2){
        if(t%div==0){
            isprime=0;
            break;
            }
        div=div+1;
        }
        if(isprime==1){
            System.out.println("fibonacciprime..:"+t);
            }  
        }
    
    }
}

               
