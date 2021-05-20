import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking_1;
    private Bedroom bedroom_1;
    private Booking booking;
    private Hotel hotel;

    @Before
    public void before(){
        bedroom_1 = new Bedroom(1, RoomType.SINGLE);
        booking_1 = new Booking(bedroom_1, 7);

    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom_1, booking_1.getBedroom());
    }

    @Test
    public void hasDuration() {
        assertEquals(7, booking_1.getDuration());
    }



}
