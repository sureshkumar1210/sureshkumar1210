class Factorial{
static void fact(int no){
    int result=1;
while(no>=1){
    result=result*no;
    no=no-1;
    }
System.out.println(result);
}
public static void main(String[] args){
    fact(5);
    

}
}

