import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom_1;

    @Before
    public void before(){
        conferenceRoom_1 = new ConferenceRoom("Glendevon", 100, true);
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("Glendevon", conferenceRoom_1.getConferenceRoomName());
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(100, conferenceRoom_1.getConferenceRoomCapacity());
    }

    @Test
    public void conferenceRoomHasCatering() {
        assertEquals(true, conferenceRoom_1.getConferenceRoomCatering());
    }
}
