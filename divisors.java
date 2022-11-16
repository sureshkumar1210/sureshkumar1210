class divisors{
   static void div(int value){
        int no=1;
    while(no<=value){
                if(value%no==0){
                    System.out.println(no);
                     }
                no=no+1;
        }
    }
public static void main(String[] args){
     div(420);
 }
}

