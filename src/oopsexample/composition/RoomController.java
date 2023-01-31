package oopsexample.composition;



public class RoomController {
    public static void main(String[] args) {
        Furniture furniture = new Furniture(true,false,"none");
        Windows windows = new Windows(3,"medium");
        Lights light = new Lights(4,2);
        Floor floor = new Floor(7,8);

        Room room = new Room(furniture, light, windows, floor );
        room.describeRoom();
    }
}
