class Bookstation extends Notebook2{
       public static void main(String args[])
        {
            Bookstation sk=new Bookstation();
            System.out.println(sk.A);
            String ap="classmate";
            if(ap==sk.A){
                  System.out.println("Long Size Note");
                  sk.LongSizeprice(60,72);
              if(ap.equals("mate")){
                  System.out.println("Low Quality Papers");
                  sk.LongSizeprice(40,30,"rough work");
                }
            else
                {
                  System.out.println("Short Size Note");
                  System.out.println("*************************************");
                  sk.ShortSizePrice(50,55);
                }
            String kumar=sk.ShortSizePrice(20,25,"rough work");
                    System.out.println(kumar);
    }
}}
                  









//           sk.LongSizeprice(60,72);
//           sk.LongSizeprice(40,30,"rough work");
//           sk.ShortSizePrice(50,55);
//           sk.ShortSizePrice(20,25,"rough work");
//       }
//}
