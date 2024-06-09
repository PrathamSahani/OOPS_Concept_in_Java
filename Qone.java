class Account{
    int acc_no;
    String name;
    float amount ;
    public void insert(int acc_no, String name, float amount){
       this.acc_no = acc_no;
       this.name = name;
       this.amount = amount;
    }
    public void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt+" Deposited");
    }
    public void credited(float amt){
        if(amount<amt){
            System.out.println("InSufficient Balance");
        }
        else{
            amount = amount-amt;
            System.out.println(amt+" Amoutn Credited");
        }
    }
    public void balance(){
        System.out.println(amount+" Left Balance");
    }
    public void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}

public class Qone{
    public static void main(String args[]){
        Account a1 = new Account();
        a1.insert(123, "Prath", 1000);
        a1.deposit(200);
        a1.credited(2000);
        a1.balance();
        a1.display();
    }
}