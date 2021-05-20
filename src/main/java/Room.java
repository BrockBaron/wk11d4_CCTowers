import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guest;
    private int capacity;

    public Room( int capacity) {
        this.guest = new ArrayList<>();
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
