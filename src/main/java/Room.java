import java.util.ArrayList;

public abstract class Room {

    private String capacity;
    private ArrayList<Guest> guestsList;

    public Room(String capacity, ArrayList<Guest> guestsList) {
        this.capacity = capacity;
        this.guestsList = new ArrayList<Guest>();
    }

    public String getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }
}
