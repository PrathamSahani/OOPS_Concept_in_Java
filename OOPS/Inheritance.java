

//When one class property want to take another class that's call Inheritance
//Uses = increase the reusability we don't need to write same code again and again.
//***we can implement same code in different -different class
//ita have four type 
//1) Single level  2) Multi level 3) hierarical  4) Hybrid 5) Multiple (we use interfeces for implement it)

import java.util.*;

//create the class 
class Shape{
    public void area(){
        System.out.println("display area");
    }
} 

//Shape ki class 

//One level (single level) function works
//Triangle = derive class || Shape = base class
class Triangle extends Shape{
    public void area(int l, int h ){
        System.out.println(l/2*l*h);
    }
}

//Aain Sahep li Slacc
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

//Multilevel = Create Function of same class multiple times
class Equiliteral extends Triangle{
    public void area(int l, int h){
        System.out.println(l/2*l*h);
    }
}
 
//Mean same class multple fiunction called hiraricial Inheritance 
public class Inheritance{
    public static void main(String[] args) {
    
    }
}
