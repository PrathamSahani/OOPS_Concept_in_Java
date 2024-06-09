
class A {
    void displayA(){
        System.out.println("A Method");
    }
}
class B extends A{
    void displayB(){
        System.out.println("B Method");
    }
}
class C extends A, B{

}
public class Qtwo{
    public static void main(String args[]){
         C x = new C();
         c.displayA();
         c.displayB();

    }
}