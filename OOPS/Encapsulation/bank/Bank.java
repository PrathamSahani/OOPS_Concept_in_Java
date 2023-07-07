
//Access modifer are four types in java 
//Define which class for which class resoursable like password is visible for only user
//1) Public   2) Private     3)Protective   4) default

// Encapsulation = when we combined data and their function in one entity
//data = class property || funciton = funciton which we wrote
//We put both data(Property) and fucntion(Method) in one unit that's call encapsulation

//Data hiding process  is operated by Access modifiers 
package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getters & setters (for access private Method)
    //getters = give the private funciton information
    //setters = set the value of private function

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank{
    public static void main(String[] args) {
        // called object
        Account account1 = new Account();

        //call public 
        account1.name = "Apna College";

        //call protected
        account1.email = "apnacollege@gmail.com";

        //call private by using setPasswrod & getPassword
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}