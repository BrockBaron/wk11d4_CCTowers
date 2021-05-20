import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guest;
    private int capacity;

    public Room(ArrayList<Guest> guest, int capacity) {
        this.guest = guest;
        this.capacity = capacity;
    }




//    Getter
    public ArrayList<Guest> getGuest() {
        return guest;
    }

    public int getCapacity() {
        return capacity;
    }
}
