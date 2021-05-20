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
    }

    public void checkOutGuest(Guest guest_1, Bedroom bedroom_1) {
        bedroom_1.removeGuestFromRoom();
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }


}
