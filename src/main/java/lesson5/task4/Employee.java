package lesson5.task4;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    public static final String whiteSpace = " ";

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surname = surname;
    }

    public String getemployee_Info() {
        return "Employee name : " + name + whiteSpace + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + whiteSpace + surname + " is " + age;
    }

    // Method is used to get total  salary
    public BigDecimal getSalary_1() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getSalary_2() {
        return baseSalary;
    }

    public BigDecimal get_B() {
        return bonus;
    }


}