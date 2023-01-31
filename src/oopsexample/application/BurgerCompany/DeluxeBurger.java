package oopsexample.application.BurgerCompany;

import java.util.Scanner;

public class DeluxeBurger extends Burger{
    private boolean isChips = false;
    private boolean isDrink = false;

    public DeluxeBurger(String name, String rollType, String meatType, double price){
        super(name, rollType, meatType, price);
    }
    public void buildDeluxeBurger(){
        this.addtopping();
        this.calculatePrice();
        System.out.println("You have selected " + getName() + " and your total price is "
                + getPrice());
    }

    public void addtopping() {
        super.addToppings();
        Scanner scanner = new Scanner(System.in);
/*
    The bellow commented code is intentional not remove to show super.addToppings() helps removes the following code.
 */
//        System.out.println("-------Select from Below Topping by entering Y/N-----------");
//        System.out.println("Carrot: ");
//        this.isCarrot = getBooleanForString(scanner.next());
//        System.out.println("Onion: ");
//        this.isOnion = getBooleanForString(scanner.next());
//        System.out.println("Tomato: ");
//        this.isTomato = getBooleanForString(scanner.next());
//        System.out.println("Lettuce: ");
//        this.isLettuce = getBooleanForString(scanner.next());
        System.out.println("Chips: ");
        this.isChips = getBooleanForString(scanner.next());
        System.out.println("Drink: ");
        this.isDrink = getBooleanForString(scanner.next());
    }

    public void calculatePrice(){
        super.calculatePrice();
        if(this.isChips){
            super.price+=5;
        }
        if(this.isDrink){
            super.price+=3;
        }
    }
}
