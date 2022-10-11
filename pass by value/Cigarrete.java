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
                        System.out.println(U+"\n"+A);
                        System.out.println(Z+"\n"+X);
                    }
               void kings()
                    {
                        System.out.println(U+"\n"+B);
                        System.out.println(Z+"\n"+Y);
                    }
                String Total()
                    {
                        System.out.println("total cost of cigarrets"+"\n"+(X+Y));
                        return("injures to health");
                    }
                  }
