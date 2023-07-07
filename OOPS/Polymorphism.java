

//***Polymorphism is made  by adding two words Poly+Morphism
//***Poly = Many | Morphism = forms
//***When we done one work by different-different method that's called Plymorphism
//***two types = 1) Compile time 2) Run time
//***Overloading = Call same class by different-different function is called Overloading 
import java.util.*;
    
        //Another class 
        class Student{
            String name;
            int age ;

            //call Student by 1 function
            public void printInfo(String name){
                System.out.println(name);
             }

             //call student by 2 function
             public void printInfo(int age){
                System.out.println(age);
             }

             //call student by 3 function
             public void printInfo(String name, int age){
                System.out.println(name+" "+age);
             }
            }
        
 
    public class Polymorphism{
            public static void main(String[] args) {
             // create object for student class
                Student s1 = new Student();
                s1.name = "aman";
                s1.age = 22;

                // call 1st function
                s1.printInfo(s1.age);

                //call 2nd fucntion
                s1.printInfo(s1.name, s1.age);

                //call 3rd function
                s1.printInfo(s1.name);
        }
}