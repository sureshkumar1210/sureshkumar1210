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
        }
}

class HouseS extends  HouseP{
     void home(){
        System.out.println("Second creating");
        System.out.println("*********************");
        System.out.println("Terraced house");
        }
}

class HouseSK extends  HouseS{
     void home(){
        System.out.println("Final creating");
        System.out.println("*********************");
        System.out.println("Apartment");
        }
 public static void main(String[] args)
        {
        HouseSK ps=new HouseSK();
        ps.home();
        }
}
