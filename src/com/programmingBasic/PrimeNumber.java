package com.programmingBasic;

public class PrimeNumber {
    public static void main(String[] args) {

        for(int i=0; i<=11; i++){
            if(isPrimeNumber(i)) {
                System.out.println(i + " is a Prime Number");
            }else{
                System.out.println(i + " is not a Prime Number");
            }
        }

    }
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            System.out.println("Invalid number");
            return false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
