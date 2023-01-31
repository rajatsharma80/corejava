package oopsexample;

public class Bank {
    private int accountNumber = 0;
    private int balance = 0;
    private String customerName = "";
    private String email = "";
    private int phoneNumber = 0;

    public Bank(){
        System.out.println("I am constructor");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAmount(int amount){
        this.balance = this.balance + amount;
    }

    public void withdrawAmount(int amount){
        if(balance > amount) {
            this.balance = this.balance - amount;
        }else{
            System.out.println("Insufficient Funds to withdraw..");
        }
    }
}
