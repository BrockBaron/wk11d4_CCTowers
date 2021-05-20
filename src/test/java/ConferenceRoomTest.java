import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("Tranquility");
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("Tranquility", conferenceRoom.getRoomName());
    }
}

