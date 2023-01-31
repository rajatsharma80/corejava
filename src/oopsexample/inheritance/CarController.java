package oopsexample.inheritance;

public class CarController {
    public static void main(String[] args) {
        Honda honda = new Honda();
        Tesla tesla = new Tesla(true);
        honda.setupMyHonda();
        System.out.println("\n===========================\n");
        tesla.setupMyTesla();
    }
}
