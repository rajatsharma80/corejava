package oopsexample.constructor;

public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public  VipCustomer(){
        this("John", 1000, "john.smith@mail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@mail.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

}

