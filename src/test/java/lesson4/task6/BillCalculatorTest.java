package lesson4.task6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorTest {

    @Test
    void shouldCalculateBillAndService() {
        //given
        BillCalculator bill = new BillCalculator();
        double expectedValue = 11.0;
        double delta = 0.1;
        //when
        double billAndService = bill.calculate(10,10);
        //then
        Assert.assertEquals(expectedValue, billAndService, delta);
    }

    @Test
    void shouldCalculateBillAndServiceMinusDiscount() {
        //given
        BillCalculator bill = new BillCalculator();
        double expectedValue = 10.75;
        double delta = 0.1;
        //when
        double billAndServiceMinusDiscount = bill.calculate(10,10, 2.5);
        //then
        Assert.assertEquals(expectedValue, billAndServiceMinusDiscount, delta);
    }

    @Test
    void shouldCalculateBillAndServiceAndCharge() {
        //given
        BillCalculator bill = new BillCalculator();
        double expectedValue = 13;
        double delta = 0.1;
        //when
        double billAndServiceMinusDiscount = bill.calculate(10, 10, (short) 2);
        //then
        Assert.assertEquals(expectedValue, billAndServiceMinusDiscount, delta);
    }
}