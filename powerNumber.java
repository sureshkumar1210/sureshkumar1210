class powerNumber{
    static void PowerNo(int no,int times){
        int count=1;
    while(times>=1){
        count=count*no;
        times=times-1;
        }
    System.out.println(count);
    }
public static void main(String[] args){
        PowerNo(8,3);      

}
}
