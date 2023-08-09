package lesson3.task3;

public class Manager extends BaseEmployee {
    protected static int baseSalary = 5000;
    private int bonus = 500;

    public Manager(String name, int employmentYear, int bonus) {
        super(name, employmentYear);
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", employmentYear=" + employmentYear +
                '}';
    }

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


}