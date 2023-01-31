package oopsexample.composition;

public class Floor {

    private int length;
    private int breadth;

    public Floor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void calculateRoomArea(){
        int area = this.length * this.breadth;
        System.out.println("Room area is " + area);
    }
}
