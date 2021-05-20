import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestsList;

    public Room(ArrayList<Guest> guestsList) {
        this.guestsList = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }
}
