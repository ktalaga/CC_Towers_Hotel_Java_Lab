import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
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


}
