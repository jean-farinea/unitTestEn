package lesson3.task1;

public class Seat {
    private int seatNumber;
    private int rowNumber;
    private boolean available;

    public Seat(int seatNumber, int rowNumber, boolean available) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.available = available;
    }

    public static String reserveSeat(Seat seatToReserve) {
        if (seatToReserve.available == true) {
            seatToReserve.available = false;
            return "You have reserved this seat successfully!";
        } else {
            return "Sorry, this seat is not available, try another one please.";
        }
    }

    public static String releaseSeat(Seat seatToRelease) {
        if (seatToRelease.available == false) {
            seatToRelease.available = true;
            return "You have released this seat successfully!";
        } else {
            return "Sorry, this seat is already available, try another one please.";
        }
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isAvailable() {
        return available;
    }

}
