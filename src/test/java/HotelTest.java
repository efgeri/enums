import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    BedRoom bedRoom;
    BedRoom bedRoom1;
    Booking booking;
    ConferenceRoom conferenceRoom;
    @Before
    public void setUp(){
        bedRoom = new BedRoom(RoomType.DOUBLE, 1,7,45.50);
        bedRoom1 = new BedRoom(RoomType.TRIPLE,2,30,35.25);
        conferenceRoom = new ConferenceRoom(RoomType.LARGE, 100, "Thomas");
        ArrayList<BedRoom> bedRooms = new ArrayList<>();
        bedRooms.add(bedRoom);
        bedRooms.add(bedRoom1);
        bedRooms.add(bedRoom);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);
        conferenceRooms.add(conferenceRoom);
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel(bedRooms, conferenceRooms);
        booking = new Booking("Riley", 2,14,100000);
    }

    @Test
    public void canAddBookingToRoom() {
        hotel.addGuestsToRoom(booking);
        assertEquals(2, hotel.getBedrooms().get(1).getGuestList().size());
    }

    @Test
    public void cantAddBookingToRoomNotEnoughNights() {
        hotel.addGuestsToRoom(booking);
        assertEquals(0, hotel.getBedrooms().get(0).getGuestList().size());
    }

    @Test
    public void canRemoveBooking(){
        hotel.addGuestsToRoom(booking);
        hotel.removeGuests(booking);
        assertEquals(0, hotel.getBedrooms().get(0).getGuestList().size());
    }

    @Test
    public void canChargeGuest(){
        hotel.addGuestsToRoom(booking);
        assertEquals(99506.50, booking.getWallet(),0);
    }
}
