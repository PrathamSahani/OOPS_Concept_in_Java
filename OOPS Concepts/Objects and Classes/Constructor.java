

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    Student(Student s2){
        this.id = s2.id;
        this.name = s2.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student(21, "Good");
        Student s2 = new Student(s1);
         s1.display();
         s2.display();
    }
}