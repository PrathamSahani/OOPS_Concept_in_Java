

// Overloading 
class Addition{
    int add(int a, int b){
        return a+b;
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class Overloading{
    public static void main(String args[]){
        Addition a1 = new Addition();
        int roll = a1.add(2, 3);
        a1.add(2, 4, 4);
    }
}