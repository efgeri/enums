public class Booking {

    String name;
    int numberOfGuests;
    public Booking(String name, int numberOfGuests) {
        this.name = name;
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}
