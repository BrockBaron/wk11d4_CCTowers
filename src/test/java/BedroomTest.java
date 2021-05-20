import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(1, 101, BedroomType.SINGLE, 1);
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

    @Test
    public void canAddGuest() {
       Guest guestOne = new Guest("Nick Lekkas");
       bedroom.addGuest(guestOne);
       assertEquals(1, bedroom.countGuestsInRoom());
    }

    @Test
    public void canRemoveGuest() {
        Guest guestOne = new Guest("Nick Lekkas");
        bedroom.addGuest(guestOne);
        bedroom.removeGuest(guestOne);
        assertEquals(0, bedroom.countGuestsInRoom());
    }
}
