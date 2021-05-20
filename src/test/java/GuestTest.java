import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void setup(){
        guest = new Guest("Nick Lekkas");

    }

    @Test
    public void guestHasName() {
        assertEquals("Nick Lekkas", guest.getGuestName());
    }
}
