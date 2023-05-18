public class Booking {

    String name;
    int numberOfGuests;
    int numberOfDays;
    double wallet;
    public Booking(String name, int numberOfGuests, int numberOfDays, double wallet) {
        this.name = name;
        this.numberOfGuests = numberOfGuests;
        this.numberOfDays = numberOfDays;
        this.wallet = wallet;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
