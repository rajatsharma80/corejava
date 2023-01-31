package com.programmingBasic;

import java.util.Scanner;

/*
This program takes input from the user, until user enters invalid number.
As soon as user enters invalid number, program will print the min and max numbers from the entered numbers
 */
public class MinAndMaxInputNumberExample {
    public static void main(String[] args) {
        int userNumber = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter Number: ");
            if(!scanner.hasNextInt()){
                break;
            }
            userNumber = scanner.nextInt();
            if(userNumber > max){
                max = userNumber;
            }
            if(userNumber < min){
                min = userNumber;
            }
        }while(true);
        System.out.println("Max number is " + max + " Min number is " + min);
        scanner.close();
    }
}
