package lesson3.task3;

public abstract class BaseEmployee {
    protected String name;
    final int baseSalary = 3000;
    final int employmentYear;

    public abstract int calculateMonthlySalary();

    public BaseEmployee(String name, int employmentYear) {
        this.name = name;
        this.employmentYear = employmentYear;
    }

    public int getYearsWorked() {
        return 2023 - employmentYear;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }
}
