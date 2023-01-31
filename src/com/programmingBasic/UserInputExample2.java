package com.programmingBasic;

import java.util.Scanner;

public class UserInputExample2 {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(i<=10){
            System.out.println("Enter number #" + i + ": ");

            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                i++;
            }else{
                scanner.nextLine();
                System.out.println("Invalid Number");
                }
            }
        System.out.println("Sum of 10 numbers is " + sum);
        scanner.close();
    }
}

