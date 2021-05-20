import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestsList;
    private int capacity;

    public Room() {
        this.guestsList = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }


}
