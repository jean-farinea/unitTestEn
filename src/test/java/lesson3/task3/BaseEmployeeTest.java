package lesson3.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseEmployeeTest {

    @Test
    void shouldCalculateMonthlySalaryForManager() {
        //given
        Manager manager1 = new Manager("Manager", 2000, 750);
        int expectedMonthlySalary = manager1.getBaseSalary() + manager1.getBonus();
        //when
        int monthlySalary = manager1.calculateMonthlySalary();
        //then
        Assertions.assertEquals(expectedMonthlySalary, monthlySalary);
    }

    @Test
    void shouldCalculateMonthlySalaryForTicketSeller() {
        //given
        TicketSeller ticketSeller1 = new TicketSeller("Ticket Seller", 2010);
        int expectedMonthlySalary = ticketSeller1.getBaseSalary();
        //when
        int monthlySalary = ticketSeller1.calculateMonthlySalary();
        //then
        Assertions.assertEquals(expectedMonthlySalary, monthlySalary);
    }

    @Test
    void shouldGetYearsWorked() {
        //given
        Manager manager1 = new Manager("Manager", 2000, 750);
        int expectedYearsWorked = manager1.getYearsWorked();
        //when
        int yearsWorked = manager1.getYearsWorked();
        //then
        Assertions.assertEquals(expectedYearsWorked, yearsWorked);
    }
}