class StoreReturn{
        public static void main(String[] args)
            {
                CalculatorReturn add=new CalculatorReturn();
                add.x=10;
                add.y=20;
                add.add();
                System.out.println(add.x-add.y);
                System.out.println(add.add());
                System.out.println(add.sub());
            }   }
