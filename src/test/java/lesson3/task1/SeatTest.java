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
        boolean isNotReserved = notReservedSeat.isAvailable();
        //then
        Assertions.assertTrue(isNotReserved);
    }

    @Test
    void shouldReleaseSeat() {
        //given
        Seat reservedSeat = new Seat(1, 2, false);
        //when
        boolean isReserved = reservedSeat.isAvailable();
        //then
        Assertions.assertFalse(isReserved);
    }

}