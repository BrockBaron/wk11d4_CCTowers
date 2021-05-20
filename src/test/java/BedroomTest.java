import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(1, 101, BedroomType.SINGLE);
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void BedroomType() {
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomType());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(101, bedroom.getRoomNumber());
    }
}
