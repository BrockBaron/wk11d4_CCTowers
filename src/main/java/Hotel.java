import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> roomList;

    public Hotel() {
        this.roomList = new ArrayList<>();
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void checkGuestIn( Room room, Guest guest) {
        room.addGuest(guest);

    }


    public void checkGuestOut(Room room, Guest guest) {
        room.removeGuest(guest);
    }

    public int countGuests() {
        return  this.roomList.size();
    }

//    public void bookRoom(){
//
//    }

    public void addRoom(Room room){
        roomList.add(room);

    }

    public void removeRoom(Room room){
        roomList.remove(room);
    }
}


