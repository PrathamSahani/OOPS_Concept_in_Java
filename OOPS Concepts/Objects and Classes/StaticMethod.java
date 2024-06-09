
//  Without Creating an Object as We
// used static keyword/ method

class Student{
    static void show(){
        System.out.println("Hello");
    }
}

public class StaticMethod{
    public static void main(String args[]){
        Student.show();
    }
}

// Instance Method
class Student{
    void show(){
        System.out.println("Hello");
    }
}

public class StaticMethod{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.show();
    }
}