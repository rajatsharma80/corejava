package oopsexample;

public class Transaction {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.depositAmount(1000);
        bank.withdrawAmount(1500);
        System.out.println("Account Balance is " + bank.getBalance());
    }
}
