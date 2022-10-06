class Cigarrete
                {
                    byte A;
                    byte B;
                    int X;
                    int Y;
                    String U="cost of single cigarrete";
                    String Z="cost of pack cigarrete";
               void lights()
                    {
                        System.out.println(U+A);
                        System.out.println(Z+X);
                    }
               void kings()
                    {
                        System.out.println(U+B);
                        System.out.println(Z+Y);
                    }
                String Total()
                    {
                        System.out.println("total cost of cigarrets"+(X+Y));
                        return("injures to health");
                    }
                  }
