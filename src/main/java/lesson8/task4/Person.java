package lesson8.task4;

public class Person implements Comparable<Person> {

    private String name;
    private String lastName;
    private int yearOfBirth;
    private double height;
    private double weight;

    public Person(String name, String lastName, int yearOfBirth, double height, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.yearOfBirth, otherPerson.yearOfBirth);
    }

    public double compareHeight(Person otherPerson) {
        return Double.compare(this.height, otherPerson.height);
    }

    public double compareWeight(Person otherPerson) {
        return Double.compare(this.weight, otherPerson.weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
