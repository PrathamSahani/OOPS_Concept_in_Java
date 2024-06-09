

// Simple Example
class Student{
    int roll_no;
    String name;
    static String school = "ITS";
    public void insert(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
        
    }
    void display(){
        System.out.println(roll_no+" "+name+" "+school);
    }
}
public class StaticMethod1{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.insert(21, "POP");
        s1.display(); 
    }
}


// Way to Change Static
class Student{
    static String  school = "Govt";
    static void change(){
        school = "Private";
    }
    void display(){
        System.out.println(school);
    }
}
public class StaticMethod1{
    public static void main(String args[]){
        Student.change();
        Student s1 = new Student();
        s1.display();
        
    }
}

// Counter Example
class Counter{
    static int count =0;
    void counter(){
        count++;
        System.out.println(count);
    }
}
public class StaticMethod1{
    public static void main(String args[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.counter();
        c2.counter();
    }
}







