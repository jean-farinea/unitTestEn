package lesson3.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void shouldReserveSeat() {
        //given
        Seat reservedSeat = new Seat(1, 2, false);
        Seat availableSeat = new Seat(2, 3, true);
        //when
        String isReserved = Seat.reserveSeat(reservedSeat);
        String isAvailable = Seat.reserveSeat(availableSeat);
        //then
        Assertions.assertSame(isReserved, "Sorry, this seat is not available, try another one please.");
        Assertions.assertSame(isAvailable, "You have reserved this seat successfully!");
        //checking if the seat was reserved properly (available changed to false)
        Assertions.assertFalse(availableSeat.isAvailable());
    }

    @Test
    void shouldReleaseSeat() {
        //given
        Seat reservedSeat = new Seat(1, 2, false);
        Seat availableSeat = new Seat(2, 3, true);
        //when
        String isReserved = Seat.releaseSeat(reservedSeat);
        String isAvailable = Seat.releaseSeat(availableSeat);
        //then
        Assertions.assertSame(isReserved, "You have released this seat successfully!");
        //checking if the seat was released properly (available changed to true)
        Assertions.assertTrue(reservedSeat.isAvailable());
        Assertions.assertSame(isAvailable, "Sorry, this seat is already available, try another one please.");
    }
}