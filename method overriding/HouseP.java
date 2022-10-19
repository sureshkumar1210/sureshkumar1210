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
        System.out.println("Roof house");
        }
    public static void main(String[] args)
        {
        HouseP ps=new HouseP();
        ps.home();
        }
} 
