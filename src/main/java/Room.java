import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room( int capacity) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }




//    Getter
    public ArrayList<Guest> getGuest() {
        return guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);

    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public int countGuestsInRoom() {
        return this.guests.size();
    }


}
