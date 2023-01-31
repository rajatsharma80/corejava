package com.programmingBasic;

public class DigitSum {
    public static void main(String[] args) {
        int sum = 0;
        int number = 2255;
        while (number > 10) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        sum = sum + number;
        System.out.println("Sum of all digits is " + sum);
    }

}
