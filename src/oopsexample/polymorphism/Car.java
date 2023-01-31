package oopsexample.polymorphism;

public class Car {
    private String name;
    private boolean  engine;
    private int cylinder;
    private int wheels;

    public Car(String name,int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Start default engine.......";
    }

    public String accelerate(){
        return "Accelerate the default way......";
    }
    
    public String brake(){
        return "Brake the default way......";
    }
}

class Honda extends Car{

    public Honda(){
        super("Honda CRV", 4);
    }

    public String startEngine(){
        return "Honda Start Turbo engine.......";
    }

    public String accelerate(){
        return "Honda CRV accelerates  0-60 in 9.3  sec......";
    }

    public String brake(){
        return "Honda has KFE KFE536-104 Ultra Quiet Advanced Premium Ceramic Brake Pad REAR......";
    }
}

class Lamborghini extends Car{
    public Lamborghini(){
        super("Lamborghini", 8);
    }

    public String startEngine(){
        return "Start Super Charge Lamborghini engine.......";
    }

    public String accelerate(){
        return "Accelerate Lamborghini from 0-60 in 2.5  sec......";
    }

    public String brake(){
        return "Brake Lamborghini carbon-ceramic brakes on both the front and the rear......";
    }
}

class Tesla extends Car{
    public Tesla(){
        super("Tesla Model 3", 0);
    }

    public String startEngine(){
        return "Start silently as there is no engine haha.......";
    }

    public String accelerate(){
        return "Accelerate Tesla from 0-60 in 3.1 sec......";
    }

    public String brake(){
        return "Brake the default way......";
    }
}

class CarController {
    public static void main(String[] args) {
        for(int i = 0; i<11; i++){
            Car carController = describeCar();
            System.out.println("Car # " + i + ": " + " Start Engine: " + carController.startEngine() + " Accelerating: " + carController.accelerate() + " Brakes: " + carController.brake() );
        }
    }
    public static Car describeCar(){
        int myCar = (int)(Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + myCar);
        switch(myCar) {
            case 1:
                return new Honda();
            case 2:
                return new Lamborghini();
            case 3:
                return new Tesla();
        }
        return null;
    }
}
