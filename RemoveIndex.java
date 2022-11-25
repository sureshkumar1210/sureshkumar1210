public class RemoveIndex{
    public static void main(String[] args){
        int[] a={10,23,34,35,67,78,98,76};
        int index=2;
        int size=a.length-1;
        int[] removea=new int[size];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(i!=2){
                removea[j]=a[i];
                j++;
                System.out.println(a[i]);
            }
        }
    }
}