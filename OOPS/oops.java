
//Object and class 

//*****Classes always start with capital character
//*****Function  always start with small character
//****In java We do not write distriuctor because in java we have a garbage Collections

import java.util.*;

//create the class 
class Pen{
    String color;
    String type; //ballpoint; gel

    //Create the function 
    public void write(){
        System.out.println("Writing somethig");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

//Another class 
class Student{
    String name;
    int age ;

    //Another function
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterized constructor (By default can made)
    Student(){
        System.out.println("Constructor Called :");
    }

    //parametrized constructor 
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class oops{
    public static void main(String[] args) {
          // first class
          Pen  pen1 = new Pen();
          pen1.color = "blue";
          pen1.type = "gel";
  
          // first class second method
          Pen pen2 = new Pen();
          pen2.color = "black";
          pen2.type = "ballpoint";
          pen1.printColor();
          pen2.printColor();
  
          // function print
          pen1.write();

        //normal call class 
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;
        s1.printInfo();


        //parameterizes Constructior call
        Student s1 = new Student("amand", 22);

        //copy constructor call
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;
        Student s2 = new Student(s1);
        s2.printInfo();

      
    }
}