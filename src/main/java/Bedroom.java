

public class Bedroom extends Room {

    private int roomNumber;
    private BedroomType bedroomType;
    private int noOfNights;
    private double roomRate;

    public Bedroom( int capacity, int roomNumber, BedroomType bedroomType, int noOfNights, double roomRate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.noOfNights = noOfNights;
        this.roomRate = roomRate;
    }




    //    getter
    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public double getRoomRate() {
        return this.roomRate;
    }

    public double getTotalBill() {
        return this.noOfNights * roomRate;
    }
}
