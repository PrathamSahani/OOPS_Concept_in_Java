// Private
class A{
    private int data=40;
    private void msg(){
        System.out.println("Hello Java");
    }
}
public class Access{
    public static void main(String args[]){
        A a1 = new A();
        a1.msg();

    }
}