package oopsexample.application.BurgerCompany;

import java.util.Scanner;

public class Burger {
    String name;
    String rollType;
    double price;
    String meatType;
    boolean isCarrot = false;
    boolean isOnion = false;
    boolean isLettuce = false;
    boolean isTomato = false;

    public Burger(String name, String rollType, String meatType, double price){
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.price = price;
    }

    public void buildBurger(){
        addToppings();
        calculatePrice();
        System.out.println("You have selected " + getName() + " and your total price is " + getPrice());
    }

    public void addToppings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Select from Below Topping by entering Y/N-----------");
        System.out.println("Carrot: ");
        this.isCarrot = getBooleanForString(scanner.next());
        System.out.println("Onion: ");
        this.isOnion = getBooleanForString(scanner.next());
        System.out.println("Tomato: ");
        this.isTomato = getBooleanForString(scanner.next());
        System.out.println("Lettuce: ");
        this.isLettuce = getBooleanForString(scanner.next());
//        calculatePrice();
//        System.out.println("You have selected " + getName() + " and your total price is "
//                + getPrice());
    }

    public void calculatePrice(){
        System.out.println("Building your burger.....");
        if(this.isCarrot){
            double carrotPrice = 0.50;
            this.price+=carrotPrice;
        }
        if(this.isOnion){
            double onionPrice = 0.25;
            this.price+=onionPrice;
        }
        if(this.isLettuce){
            double lettucePrice = 1.00;
            this.price+=lettucePrice;
        }
        if(this.isTomato){
            double tomatoPrice = 1.50;
            this.price+=tomatoPrice;
        }
    }

    public boolean getBooleanForString(String topping){
        boolean isTopping = false;
        do {
            if (topping.equalsIgnoreCase("Y")) {
                isTopping = true;
            }else if(!topping.equalsIgnoreCase("Y") && !topping.equalsIgnoreCase("N")){
                System.out.println("Incorrect option, enter Y/N: ");
                Scanner scanner = new Scanner(System.in);
                scanner.next();
            }
        }while(topping.equalsIgnoreCase("Y") && topping.equalsIgnoreCase("N"));
        return isTopping;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return this.price;
    }
}
