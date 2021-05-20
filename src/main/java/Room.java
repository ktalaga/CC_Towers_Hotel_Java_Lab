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
//
//    public void addGuestToRoom(Guest guest){
//    }

    public int getNumberOfGuestsInTheRoom() {
        return this.getGuestsList().size();
    }
    public void addGuestToRoom(Guest guest){
        this.guestsList.add(guest);
    }

    public void removeGuestFromRoom(){
        this.guestsList.clear();
    }

}
