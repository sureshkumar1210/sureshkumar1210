class Animal{
    void eat(){
        System.out.println("eating....");
                }
}


class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
                }
}


class TestSingleInheritance{
    public static void main(String[] args)
        {
         Dog x=new Dog();
         x.bark();
         x.eat();
         System.out.println("There is dog behaviour");
        }
}
