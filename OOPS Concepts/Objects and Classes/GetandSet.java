
class Student{
    private int roll;
    private String name;
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
 
}
public class GetandSet{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setRoll(21);
        int roll = s1.getRoll();
        System.out.println(roll);
        s1.setName("POP");
        String name = s1.getName();
        System.out.println(name);
        

    }
}