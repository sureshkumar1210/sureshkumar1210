class Reverseletter{
    static void ReverseL(String name){
        int no=name.length()-1;
    while(no>=0){
        System.out.println(name.charAt(no));
        no=no-1;
    }
}
public static void main(String[] args){
        ReverseL("sureshkumar");
}
}
