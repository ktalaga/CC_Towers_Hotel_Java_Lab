import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom_1;
    private Bedroom bedroom_2;
    private Bedroom bedroom_3;
    private Bedroom bedroom_4;
    private ConferenceRoom conferenceRoom_1;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest_1;
    private ArrayList<Guest> guests;
    private Booking booking;

    @Before
    public void before() {
        bedroom_1 = new Bedroom(1, RoomType.SINGLE);
        bedroom_2 = new Bedroom(2, RoomType.DOUBLE);
        bedroom_3 = new Bedroom(3, RoomType.FAMILY);
        bedroom_4 = new Bedroom(4, RoomType.FAMILY);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom_1);
        bedrooms.add(bedroom_2);
        bedrooms.add(bedroom_3);
        bedrooms.add(bedroom_4);
        conferenceRoom_1 = new ConferenceRoom("Glendevon", 100, true);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom_1);
        hotel = new Hotel(bedrooms, conferenceRooms);
        guest_1 = new Guest("Andy Sharkey");
    }

    @Test
    public void shouldHaveBedrooms() {
        assertEquals(4, hotel.getNumberOfBedrooms());
    }

    @Test
    public void shouldHaveConferenceRooms() {
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void shouldBeAbleToCheckInGuestIfRoomEmpty(){
        hotel.checkInGuest(guest_1, bedroom_1);
        assertEquals(1, bedroom_1.getNumberOfGuestsInTheRoom());
        assertEquals(false, bedroom_1.getRoomEmpty());
    }

    @Test
    public void shouldBeAbleToCheckOutGuest() {
        hotel.checkInGuest(guest_1, bedroom_1);
        hotel.checkOutGuest(guest_1, bedroom_1);
        assertEquals(0, bedroom_1.getNumberOfGuestsInTheRoom());
        assertEquals(true, bedroom_1.getRoomEmpty());
    }

    @Test
    public void shouldBeAbleToBookRoom(){

        booking = hotel.bookRoom(bedroom_1, 7);
        assertEquals(7, booking.getDuration());
        assertEquals(1, booking.getBedroom().getRoomNumber());

    }
    @Test
    public void canCalculateTotalBill() {
        booking = hotel.bookRoom(bedroom_1, 7);
        assertEquals(245, booking.getTotal());
    }

    @Test
    public void canReturnCollectionOfEmptyRooms() {
    }

    @Test
    public void roomEmptyShouldStartAsTrue() {
        assertEquals(true, bedroom_1.getRoomEmpty());
    }

    @Test
    public void shouldChangeRoomEmpty(){
        bedroom_1.setRoomEmpty(false);
        assertEquals(false, bedroom_1.getRoomEmpty());
    }

    @Test
    public void shouldReturnCollectionOfOnlyVacantRooms(){

        hotel.checkInGuest(guest_1, bedroom_1);
        assertEquals(3, hotel.getVacantRooms());
    }


}
