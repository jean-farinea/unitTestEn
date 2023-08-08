package lesson3.task3;

public class BaseEmployee {
    private String name;
    private float baseSalary = 3000;
    final int employmentYear;

    public void calculateMonthlySalary() {

    }

    public BaseEmployee(String name, float baseSalary, int employmentYear) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employmentYear = employmentYear;
    }

    public String getName() {
        return name;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }
}
