package lesson4.task8;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String email;
    private String nationality;

    public Person(String name, String surname, String email, String nationality) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else if (Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(email, person.email) &&
                Objects.equals(nationality, person.nationality)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, nationality);
    }

}