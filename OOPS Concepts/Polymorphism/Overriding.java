

class Bank{
    int getRateOfInterst(){
        return 0;
    }
}
class ICICI extends Bank{
    int getRateOfInterst(){
        return 5;
    }
}
class Axis extends Bank{
    int getRateOfInterst(){
        return 7;
    }
}
public class Overriding{
    public static void main(String args[]){
        ICICI i1 = new ICICI();
        Axis a1 = new Axis();
        System.out.println(i1.getRateOfInterst());
        System.out.println(a1.getRateOfInterst());
    }
}