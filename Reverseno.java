import java.util.Arrays;

class Reverseno{
    public static void main(String[] args){
        int[] a={12,34,56,78,90,100};
        int j=a.length-1;
        for(int i=0;i<j;i++){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(a));
        }
    }
