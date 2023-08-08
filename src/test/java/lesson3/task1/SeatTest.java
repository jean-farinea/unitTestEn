package lesson3.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void shouldReserveSeat() {
        //given
        Seat notReservedSeat = new Seat(2, 3, true);
        //when
        notReservedSeat.reserveSeat();
        //then
        Assertions.assertFalse(notReservedSeat.isAvailable());
    }

    @Test
    void shouldReleaseSeat() {
        //given
        Seat reservedSeat = new Seat(1, 2, false);
        //when
        reservedSeat.releaseSeat();
        //then
        Assertions.assertTrue(reservedSeat.isAvailable());
    }

}