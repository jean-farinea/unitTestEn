package lesson4.task8;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String email;

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Person) obj).email.equals(this.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

}