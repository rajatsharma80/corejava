package oopsexample.inheritance;

public class Car extends Vehicle {

    int gear;
    int door;
    boolean isElectric;
    boolean isManual;
    int currentGear;

    public Car(int gear, int door, boolean isElectric, boolean isManual, String vehicleType, String vehicleSize){
        super(vehicleType, vehicleSize);
        this.gear = gear;
        this.door = door;
        this.isElectric = isElectric;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int gear){
        System.out.println("Switch to " + gear + " gear ");
        this.currentGear = gear;
    }

    public void doorAlert(int door){
        System.out.println("Open " + door + " of the car");
        this.door = door;
    }

    public void selfDrive(boolean isSelfDrive){
        describeVehicle("Car.....-");
        if(isSelfDrive){
            System.out.println("This car is in Self Driving mode...");
            enableSelfDrivingFeatures("Straight", 50, false, "red" );
        }else{
            System.out.println("Driver is driving this car...");
            disableSelfDrivingFeatures();
        }
    }


    public void enableSelfDrivingFeatures(String direction, int speed, boolean isObstacle, String signalColor){
        move(direction, speed);
        if(speed > 50){
            System.out.println("Your Speed is more than 50...");
        }
        if(direction.equalsIgnoreCase("Left") || direction.equalsIgnoreCase("Right") ){
            System.out.println("This Car is turning.....");
        }
        if(direction.equalsIgnoreCase("Straight")){
            System.out.println("This Car is Going Straight.....");
        }
        if(isObstacle){
            System.out.println("Honk.....Honk.....");
        } if(!isObstacle){
            System.out.println("Do not Honk.....");
        }
        if(signalColor.equalsIgnoreCase("Red")){
            super.stop();
            System.out.println("Speed is " + super.getSpeed());
            System.out.println("This car is stopping.....");
        }
        if(signalColor.equalsIgnoreCase("Green")){
            System.out.println("Zoommm.....");
        }
    }

    public void disableSelfDrivingFeatures(){
        System.out.println("All Self Driving Features are turned off...");
    }

}
