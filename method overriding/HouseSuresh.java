class House{
    void home(){
        System.out.println("*********************");
        System.out.println("*********************");
        System.out.println("empty land");
        }
}

class HouseP extends House{
     void home(){
        System.out.println("First created");
        System.out.println("*********************");
        System.out.println("Tiled Roof class");
        System.out.println("---------------------");
        }
}

class HouseS extends  House{
     void home(){
        System.out.println("Second creating");
        System.out.println("*********************");
        System.out.println("Terraced house");
        System.out.println("---------------------");
        }
}

class HouseSuresh {
     void home(){
        System.out.println("Final creating");
        System.out.println("*********************");
        System.out.println("Apartment");
        System.out.println("---------------------");
        }
 public static void main(String[] args)
        {
        HouseP ps=new HouseP();
        HouseS SK=new HouseS();
        HouseSuresh suresh=new HouseSuresh();
        ps.home();
        SK.home();
        suresh.home();
        }
}
