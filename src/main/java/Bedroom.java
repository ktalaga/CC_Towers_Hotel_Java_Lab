import java.util.ArrayList;

public class Bedroom extends Room{


    private int roomNumber;
    private RoomType roomType;
    private boolean roomEmpty;

    public Bedroom(int roomNumber, RoomType roomType) {
        super();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomEmpty = true;
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

    public int getRoomRate(){
        return this.roomType.getRate();
    }

    public boolean getRoomEmpty(){
        return roomEmpty;
    }

    public void setRoomEmpty(boolean updateRoomEmpty) {
        this.roomEmpty = updateRoomEmpty;
    }
}
