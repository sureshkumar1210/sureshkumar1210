class Reverseno{
    static void Reverse(int no){
        int div=10;
    while(no>=1){
        System.out.println(no%div);
        no=no/div;
        }
}
public static void main(String[] args){
        Reverse(4532);
}
        
}
