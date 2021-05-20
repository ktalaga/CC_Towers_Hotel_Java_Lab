import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom_1;
    private Bedroom bedroom_2;
    private Bedroom bedroom_3;
    private ConferenceRoom conferenceRoom_1;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest_1;

    @Before
    public void before() {
        bedroom_1 = new Bedroom(1, RoomType.SINGLE);
        bedroom_2 = new Bedroom(2, RoomType.DOUBLE);
        bedroom_3 = new Bedroom(3, RoomType.FAMILY);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom_1);
        bedrooms.add(bedroom_2);
        bedrooms.add(bedroom_3);
        conferenceRoom_1 = new ConferenceRoom("Glendevon", 100, true);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom_1);
        hotel = new Hotel(bedrooms, conferenceRooms);
        guest_1 = new Guest("Andy Sharkey");
    }

    @Test
    public void shouldHaveBedrooms() {
        assertEquals(3, hotel.getNumberOfBedrooms());
    }

    @Test
    public void shouldHaveConferenceRooms() {
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void shouldBeAbleToCheckInGuest(){
        this.checkInGuest(guest_1, bedroom_1);
        assertEquals(1, bedroom_1.getNumberOfGuestsInTheRoom());
    }


}
