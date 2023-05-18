public class BedRoom extends Room{
    private int roomNumber;
    private int availability;
    private double rate;
    public BedRoom(RoomType roomType, int roomNumber, int availability, double rate) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.availability = availability;
        this.rate = rate;
    }

    public int getAvailability() {
        return availability;
    }

    public double getRate() {
        return rate;
    }
}
