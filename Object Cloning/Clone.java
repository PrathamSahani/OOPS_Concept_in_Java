



class Student implements Cloneable{
    int roll_no;
    String name;

    Student(int r, String n){
        this.roll_no = r;
        this.name = n;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public void display(){
        System.out.println(roll_no+" "+name);
    }
}
public class Clone{
    public static void main(String args[]){
           try{
            Student s1 = new Student(21, "Okay");
           Student s2 = (Student)s1.clone();
           s1.display();
           s2.display();
           }catch ( CloneNotSupportedException c){

           }

    }
}