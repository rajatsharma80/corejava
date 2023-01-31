package oopsexample.inheritance;
/*
hand steer, change gear, increase or decrease speed
 */
public class Vehicle {

String vehicleType;
String vehicleSize;
String direction;
int speed;

    public Vehicle(String type, String vehicleSize){
        this.vehicleType = type;
        this.vehicleSize = vehicleSize;
    }

    public void describeVehicle(String vehicleType){
        System.out.println("This is a " + vehicleType + "......");
    }

    public void move(String direction, int speed){
        System.out.println("Move in " + direction + " with a speed of " + speed);
    }

    public void stop(){
        this.speed = 0;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public String getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }
}
