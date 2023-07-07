

//Abstraction - Means Show the imp things to user other then hide for the user
//Always call the first base class constructor then called the derive class constructor this concept is called in java constructor chaining 

import java.util.*;

abstract class  Animal{
    abstract void walk();
    //Base Constructor
    Animal(){
        System.out.println("You are crearting a new Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    }

class Horse extends Animal{
    //Derive Constructor
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}


class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        
        // Animal is abstract; cannot be instantiated (runtime error)
        // Animal animal = new Animal();
        // animal.walk();
    }
}