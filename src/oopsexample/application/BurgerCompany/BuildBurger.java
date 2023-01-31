package oopsexample.application.BurgerCompany;

import java.util.Scanner;

/*
    This application allows customer to buy 3 different types of burger from Burger Company.
    Where Option 1 is having basic burger option, with maximum choice of 4 different toppings
    Option 2 is having Healthy burger option with 2 extra toppings to choose from
    Option 3 is having 4 toppings but with choice of Chips and Drinks.

    This application demonstrates basic Java controls like:
    1. Taking inputs from user.
    2. Loops - do while, Switch
    3. If Condition

    As well as OOPS concepts like:
    1. Encapsulation - variables defined in HealthyBurger & DeluxeBurger class.
    2. Polymorphism - addtopping & calculatePrice() as method overriding
    3. Inheritance - HealthyBurger and DeluxeBurger derived from Burger class, with each class specific
    characteristics.
    4. Use of super and this keyword to remove code duplication.
 */
public class BuildBurger {
    public static void main(String[] args) {
        
        String name;
        String rollType;
        String meatType;
        double price;
        int option = 4;
        Burger basicBurger = new Burger("Basic Burger", "White Bread Roll", "Chicken", 1.00);
        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", "Brown Rye Roll", "Soy patties", 2.00);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "Italian Roll", "Chicken", 3.00);
        System.out.println("================Welcome to Burger Company================");
        System.out.println("Please choose your burger: \n" +
                "Option 1: Standard Burger with a choice of 4 toppings. " + "Price - "
                    + basicBurger.getPrice() + "\n" +
                "Option 2: Healthy Burger with a choice of 6 toppings. " + "Price - "
                    + healthyBurger.getPrice() + "\n" +
                "Option 3: Deluxe Burger with a choice 4 toppings and choice of drink and chips. " + "Price - "
                    + deluxeBurger.getPrice() + "\n" );

        Scanner scanner = new Scanner(System.in);
        String cont = "Y";
        do {
            System.out.println("Enter your Burger option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    basicBurger.buildBurger();      //4.25
                    break;
                case 2:
                    healthyBurger.buildHealthBurger();
                    break;     //9.00
                case 3:
                    deluxeBurger.buildDeluxeBurger();
                    break;     //14.25
                case 4:
                    System.out.println("Thank You, Existing the Burger Company");
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
            System.out.println("Do you want to buy more burgers(Enter Y/N) ?");
            cont = scanner.next();
        }while(cont.equalsIgnoreCase("Y"));
    }
}
