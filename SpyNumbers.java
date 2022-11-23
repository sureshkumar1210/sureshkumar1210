class SpyNumbers{
    public static void main(String[] args){
        int no=132;
        int add=0;
        int multi=1;
        while(no>0){
           add=add+no%10;
           multi=multi*no%10;
           no=no/10;
        }
        System.out.println(add+"\n"+multi);
        if(add==multi){
            System.out.println("it's spynumber");
            }
        else{
            System.out.println("not Spynumber");
            }
    }
}
               
