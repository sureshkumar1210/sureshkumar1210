/*class woodenchair{
        String ChairColour="yelloe";
    void Seating(){
        System.out.println("wooden seating");
            }
}*/

class Steelchair extends woodenchair{
        String ChairColour="Black";
    void Seating(){
        System.out.println("Steel seating");
          }
 public static void main(String[] args)
        {
    Steelchair suresh=new Steelchair();
    System.out.println(suresh.ChairColour);
    suresh.Seating();
        }
}
