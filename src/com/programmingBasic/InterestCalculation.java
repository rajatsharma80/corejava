package com.programmingBasic;

/*
Calculate the interest
 */
public class InterestCalculation {
    public static void main(String[] args) {
        double rate = 2.00;
        double interest = 0.0;
        System.out.println("");
        for(int i=2; i<9; i++){
            System.out.println("interest amount: " + String.format("%.2f", (calculateInterest(10000, i) )));
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
