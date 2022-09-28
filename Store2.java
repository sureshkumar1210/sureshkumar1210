class Store2{
        public static void main(String[] args)
            {
                Calculator2 add=new Calculator2();
                add.x=10;
                add.y=20;
                add.add();
                Calculator2 sub=new Calculator2();
                System.out.println(add.x-add.y);
            }   }
