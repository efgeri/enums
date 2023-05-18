import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Booking> guestList;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guestList = new ArrayList<>();
    }

    public RoomType canGetRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getRoomCapacity(){
        return this.roomType.getValue();
    }

    public void setGuestList(Booking booking) {
        for ( int i = 0 ; i <  booking.getNumberOfGuests(); i++){
            this.guestList.add(booking);
        }
    }

    public ArrayList<Booking> getGuestList() {
        return guestList;
    }
}
