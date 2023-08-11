package lesson3.task1;

public class Seat {
    private final int seatNumber;
    private final int rowNumber;
    private boolean available;

    public Seat(int seatNumber, int rowNumber, boolean available) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.available = available;
    }

    public void reserveSeat() {
        if (available) {
            available = false;
        }
    }

    public void releaseSeat() {
        if (!available) {
            available = true;
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