class Countdivisors{
   static void div(int value){
        int no=1;
        int count=0;
    while(no<=value){
                if(value%no==0){
                     count=count+1;      //y we use this count becoz we need to how many time count the numbers
                    System.out.println("divisore are..:"+no);
                     }
                no=no+1;
               System.out.println(count);
        }
    }
public static void main(String[] args){
     div(420);
 }
}

