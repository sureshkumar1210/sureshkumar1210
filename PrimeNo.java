class PrimeNo{
    static void prime(int no){
        int div=1;
        int count=0;
        while(div<=no){
            if(no%div==0){
                    count=count+1;
                    }
                    div=div+1;
            }
            if(count==2){
                System.out.println("this is prime...:"+count);
                    }
            else{
                System.out.println("this is not prime..:"+count);
                }
}
public static void main(String[] args){
            prime(17);
}
} 
