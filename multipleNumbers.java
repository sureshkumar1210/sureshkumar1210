class multipleNumbers{
    int numbers(int no){
    while(no<=100){
        if(no%3==0){
            if(no%5==0){
                System.out.println("3 and 5 multiple numbers:"+no);
                }
               }
            no=no+1;
        }
    return(no);
} 
public static void main(String[] args){
            multipleNumbers sk=new multipleNumbers();
                int kumar=sk.numbers(1);
                System.out.println(kumar);
}
}
