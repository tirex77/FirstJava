package com.akolesnik.FirstJava;

public class Person {
    String firstName;
    String lastName;

    public Person() {
       this.firstName = "Alexey";
       this.lastName = "Kolesnik";
    }

    Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName;

    }
}
