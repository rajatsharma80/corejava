package oopsexample.application.BurgerCompany;

import java.util.Scanner;

public class HealthyBurger extends Burger{

private boolean isCheese = false;
private boolean isCucumber = false;

    public HealthyBurger(String name, String rollType, String meatType, double price){
        super(name, rollType, meatType, price);
    }

    public void buildHealthBurger(){
            this.addtopping();
            this.calculatePrice();
            System.out.println("You have selected " + getName() + " and your total price is "
                    + getPrice());
    }

    public void addtopping(){
        super.addToppings();
        Scanner scanner = new Scanner(System.in);
/*
    The bellow commented code is intentional not remove to show by refactoring the code
     and by using super.addToppings() helps removes the following code.
 */
//            System.out.println("-------Select from Below Topping by entering Y/N-----------");
//            System.out.println("Carrot: ");
//            this.isCarrot = getBooleanForString(scanner.next());
//            System.out.println("Onion: ");
//            this.isOnion = getBooleanForString(scanner.next());
//            System.out.println("Tomato: ");
//            this.isTomato = getBooleanForString(scanner.next());
//            System.out.println("Lettuce: ");
//            this.isLettuce = getBooleanForString(scanner.next());
        System.out.println("Cheese: ");
        this.isCheese = getBooleanForString(scanner.next());
        System.out.println("Cucumber: ");
        this.isCucumber = getBooleanForString(scanner.next());
    }

    public void calculatePrice(){
        super.calculatePrice();
        if(this.isCheese){
            super.price+=2;
        }
        if(this.isCucumber){
            super.price+=1.75;
        }
    }
}
