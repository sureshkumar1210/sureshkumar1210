public class Developement implements Park,Consttruction{
public void sittingChair(){
    int chairs = 20;
    System.out.println(chairs);
    }
public void bricks(){
    System.out.println("1500 bricks");
    }
public void trees(){
    int tree = 15;
    System.out.println(tree);
    }
public void cement(){
    String name="Shankar Cements";
    System.out.println(name);
    System.out.println(PRICE_DE);
    }
public void sand(){
    String type = "seived";
    System.out.println(type);
    }
public static void main(String[] args){
    Developement dv = new Developement();
    dv.trees();
    dv.cement();
    dv.sand();
    }
}




