

public class Bedroom extends Room {

    private int roomNumber;
    private BedroomType bedroomType;
    private int noOfNights;

    public Bedroom( int capacity, int roomNumber, BedroomType bedroomType, int noOfNights) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.noOfNights = noOfNights;
    }



//    getter
    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }
}
