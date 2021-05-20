import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom_1;
    private Guest guest_1;



    @Before
    public void before(){
        bedroom_1 = new Bedroom(1, RoomType.SINGLE);
        guest_1 = new Guest("Andy Sharkey");
    }



    @Test
    public void shouldHaveNumber(){
        assertEquals(1, bedroom_1.getRoomNumber());
    }

    @Test
    public void shouldHaveType() {
        assertEquals(RoomType.SINGLE, bedroom_1.getRoomType());
    }

    @Test
    public void shouldHaveCapacity() {
        assertEquals(1, bedroom_1.getRoomCapacity());
    }

    @Test
    public void shouldHave0GuestsAtStart() {
        assertEquals(0, bedroom_1.getNumberOfGuestsInTheRoom());
    }

    @Test
    public void canAddGuestToRoom() {
        bedroom_1.addGuestToRoom(guest_1);
        assertEquals(1, bedroom_1.getNumberOfGuestsInTheRoom());
    }
}
