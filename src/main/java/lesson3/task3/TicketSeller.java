package lesson3.task3;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, int employmentYear) {
        super(name, employmentYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "TicketSeller{" +
                "baseSalary=" + baseSalary +
                ", employmentYear=" + employmentYear +
                '}';
    }

}