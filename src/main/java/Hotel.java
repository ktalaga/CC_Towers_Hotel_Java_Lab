import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> emptyBedrooms;


    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.emptyBedrooms = new ArrayList<Bedroom>();
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkInGuest(Guest guest, Bedroom bedroom){
       bedroom.addGuestToRoom(guest);
       bedroom.setRoomEmpty(false);
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        bedroom.removeGuestFromRoom();
        bedroom.setRoomEmpty(true);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }

    public int getVacantRooms(){
        for(Bedroom bedroom : bedrooms){
            if (bedroom.getRoomEmpty() == true){
                emptyBedrooms.add(bedroom);

            }
        }return emptyBedrooms.size();

    }

}
