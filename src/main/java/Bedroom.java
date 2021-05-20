import java.util.ArrayList;

public class Bedroom extends Room{


    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType) {
        super();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomCapacity(){
        return this.roomType.getCapacity();
    }




}
