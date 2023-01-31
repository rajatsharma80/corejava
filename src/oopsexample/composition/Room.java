package oopsexample.composition;

public class Room {
    private Furniture furniture;
    private Lights lights;
    private Windows windows;
    private Floor floor;

    public Room(Furniture furniture, Lights lights, Windows windows, Floor floor) {
        this.furniture = furniture;
        this.lights = lights;
        this.windows = windows;
        this.floor = floor;
    }

    public void describeRoom(){
        getFurniture().findRoomType();
        lights.totalLights();
        windows.getWindowCount();
        getFloor().calculateRoomArea();
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Floor getFloor() {
        return floor;
    }
}
