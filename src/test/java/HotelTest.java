import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Room room;
    private Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        room = new Bedroom(1, 101, BedroomType.SINGLE, 1, 50.00);
        guest = new Guest("Nick Lekkas");
    }

    @Test
    public void canCheckGuestIn() {
        hotel.checkGuestIn(room, guest);
        assertEquals(1, room.countGuestsInRoom());

    }

   @Test
    public void canCheckGuestOut() {
       hotel.checkGuestIn(room, guest);
       hotel.checkGuestOut(room, guest);
        assertEquals(0, room.countGuestsInRoom());
    }

    @Test
    public void canAddBooking() {
        hotel.addRoom(room);
        assertEquals(1, hotel.countBooking());
    }

    @Test
    public void canRemoveBooking() {
        hotel.addRoom(room);
        hotel.removeRoom(room);
        assertEquals(0, hotel.countBooking());

    }


}
