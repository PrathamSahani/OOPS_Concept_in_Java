// Way to Intiallize Object 


// First : Reference Variable
class Student{
    int id;
    String name;
}

public class Objects{
    public static void main(String args[]){
         Student s1 = new Student();
         s1.id = 21;
         s1.name = "Pop";
         System.out.print(s1.id+" "+s1.name);
    }
}


//  Second :  Creating Method
class Student{
    int id ;
    String name;
    void insert(int i, String n){
        this.id = i;
        this.name  = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Objects{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.insert(21, "pop");
        s1.display();
    }
}


// Third : Constructor
class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Objects{
    public static void main(String args[]){
        Student s1 = new Student(21, "Pop");
        s1.display();
    }
}