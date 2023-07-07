//No constructor we can made for interfaces || 
//Non abstract funciton error || No fucntion implementation 
//use implements instead extends 

import java.util.*;

//static = the things which is common for class

//ex.
class Student {
    String name ;
    static String school;
    public static void changeSchool(){
        school = "newschool";
    }
}

interface Animal{
    int eyes =2; //static for all 
    public void walk(); //method always public and abstracct by default
    // void walk();
    // Animal(){

    // }

}
interface Herbivore{

}

//we can take both class property by below method in one function (mulitple inhertince called)

class Horse implements Animal, Herbivore{
    public void walk(){ //its show error is we remove public 
        System.out.println("Walks on 4 legs");
    }

}

public class interfaces{
    public static void main(String[] args) {
        //cr4eate the object 
        Horse horse = new Horse();
        horse.walk();

        //static can be Assecc by class name 
        Student.school ="JMV";
        Student Student1 = new Student();
        Student1.name = "tony";
        System.out.println(Student1.school);

    }
}