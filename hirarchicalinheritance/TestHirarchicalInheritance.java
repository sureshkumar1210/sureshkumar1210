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

class Cat extends Animal{
    void meow(){
        System.out.println("meow...");
                }
}

class TestHirarchicalInheritance{
    public static void main(String args[])
        {
    Cat pattu=new Cat();
    pattu.meow();
    pattu.eat();
    System.out.println("There is Cat behaviour");
    Dog bujju=new Dog();
    bujju.bark();
    bujju.eat();
    System.out.println("There is Dog behaviour");
        }
} 
