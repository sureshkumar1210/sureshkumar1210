class Mnc3
            {
          public static void main(String[] args)
                {
                    Ite suresh=new Ite();
                    Ite Sk=new Ite();
                    suresh.id=-1;
                    Sk.id=100;
                    boolean x=(suresh.id<0);
                    boolean y=(Sk.id>90);
                if(x)
                    {
                      
                        suresh.Salary();
                       System.out.println("developer");
                        if(y)
                        {
                        System.out.println("he is good trainer");
                         }
                    
                    }
                else
                    {
                        System.out.println("manager of the company");
                            Sk.Salary(10);
                        System.out.println("software engineer");
                     
                        
                    }
                }  
             }                  
