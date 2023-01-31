package oopsexample.inheritance;

public class Tesla extends Car{

    boolean isSelfDrive;
    String roadType;

    public Tesla(boolean isSelfDrive) {
        super(5, 4, true, false, "car", "standard");
        this.isSelfDrive = isSelfDrive;
        this.roadType = "highway";
    }

    public void setupMyTesla(){
        enableDisableSelfDriving(isSelfDrive);
    }

    public void enableDisableSelfDriving(boolean isSelfDrive){
        if(isSelfDrive){
            isSelfDrive = true;
        }else{
            isSelfDrive = false;
        }
        super.selfDrive(isSelfDrive);
    }
}
