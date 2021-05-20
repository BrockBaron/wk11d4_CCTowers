

public class Bedroom extends Room {

    private int roomNumber;
    private BedroomType bedroomType;

    public Bedroom( int capacity, int roomNumber, BedroomType bedroomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }



//    getter
    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }
}
