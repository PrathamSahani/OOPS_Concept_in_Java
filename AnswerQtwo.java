

interface A{
    default void display(){
        System.out.println("Method A");
    }
}
interface B{
    default void display(){
        System.out.println("Method B");
    }
}
class MyClass implements A, B{
    public void display(){
        A.super.display();

    }
}
public class AnswerQtwo{
    public static void main(String args[]){
        MyClass x = new MyClass();
        x.display();
    }
}