package oopsexample.inheritance;

public class Honda extends Car{

    public Honda() {
        super(5, 2, false, true, "Car", "standard");
    }

    public void setupMyHonda(){
        super.selfDrive(false);
    }
}
