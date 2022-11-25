import java.util.Scanner;
public class scanner {
   public static void main(String[] args){
    Scanner myobj=new Scanner(System.in);
    System.out.println("enter a name");
    String username=myobj.nextLine();
    System.out.println("username:"+username);
   } 
}
