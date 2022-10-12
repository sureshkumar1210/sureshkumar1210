class useageWater
                {
       public static void main(String[] args)
             {
                waterTank suresh=new waterTank();
                suresh.y=90000000;
                suresh.z=80000000;
                suresh.Doublwtank();
                suresh.Singletank();
                suresh.Singletank(25,45);
                System.out.println("non drinking water");
                String kumar=suresh.Drinkingwater();
                System.out.println(kumar);
            }
                }
                
