
// Super used in Parent Class
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Super{
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.printColor();
    }
}


// By Using super call the superclass constroctor
class Animal{
    Animal(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Barking...");
    }
    void eat(){
      
        System.out.println("Eating double...");
    }
}
public class Super{
    public static void main(String args[]){
        Dog d1=  new Dog();
        
    }
}

// Real Example
class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person{
    int salary;
    Emp(int id, String name, int salary){
        super(id, name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class Super{
    public static void main(String args[]){
        Emp e1 = new Emp(21,"Digital", 2000);
        e1.display();
        
    }
}

