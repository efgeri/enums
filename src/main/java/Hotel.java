import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<BedRoom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void addGuestsToRoom(Booking booking){
        for (BedRoom bedroom : bedrooms){
            if (bedroom.getRoomCapacity() >= booking.numberOfGuests && bedroom.getAvailability() >= booking.getNumberOfDays()){
                bedroom.setGuestList(booking);
                booking.setWallet(booking.getWallet() - (booking.getNumberOfDays() * bedroom.getRate()));
                return;
            }
        }
    }


    public void removeGuests(Booking booking){
        for (BedRoom bedRoom : bedrooms){
            if (bedRoom.getGuestList().contains(booking)){
                bedRoom.emptyRoom();
            }
        }
    }

    public void availableRooms(BedRoom bedrooms){
        
    }

    public ArrayList<BedRoom> getBedrooms() {
        return bedrooms;
    }
}

