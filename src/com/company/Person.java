package com.company;

public class Person {
    private final String firstname;
    private final String lastname;
    private final Address address;

    public Person(String firstname, String lastname, Address address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname: " + firstname +
                ", lastname: " + lastname +
                ", City: " + address.getCity() +
                ", Street: " + address.getStreet() +
                ", homeNumber: " + address.getHomeNumber() +
                '}';
    }
}
