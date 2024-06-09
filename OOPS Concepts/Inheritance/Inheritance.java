

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void weep(){
        System.out.println("Weeping...");
    }
}

public class Inheritance{
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.bark(); 
        Cat c1 = new Cat();
        c1.weep();
        d1.eat();
    }
}