package com.akolesnik.FirstJava;

public class Person {
    String firstName;
    String lastName;

    Person() {
       this.firstName = "Alexey";
       this.lastName = "Kolesnik";
    }

    Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
