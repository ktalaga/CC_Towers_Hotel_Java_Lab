import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom_1;


    @Before
    public void before(){
        bedroom_1 = new Bedroom(1, RoomType.SINGLE);
    }

    @Test
    public void shouldHaveNumber(){
        assertEquals(1, bedroom_1.getRoomNumber());
    }

    @Test
    public void shouldHaveType() {
        assertEquals(RoomType.SINGLE, bedroom_1.getRoomType());
    }
}
