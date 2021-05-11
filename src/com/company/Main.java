package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Minsk", "Kutuzova", 1);
        Address address2 = new Address("Madrid", " Gran Via", 10);
        Address address3 = new Address("Praga", "Ostrovni", 125);
        Address address4 = new Address("Smilovichi", " Pervomayskaya", 15);
        Address address5 = new Address("Berlin", "Friedrichsgracht", 17);

        Person p1 = new Person("Tom", "Cruise", address1);
        Person p2 = new Person("Tom", "Hardy", address2);
        Person p3 = new Person("Brad", "Pitt", address3);
        Person p4 = new Person("Bradley", "Cooper", address4);
        Person p5 = new Person("Angelina ", "Jolie", address5);
        Person p6 = new Person("Zinedin", "Zidan", null);

        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

        List<String> list = persons
                .stream()
                .filter(item -> item.getFirstname() != null &&
                        item.getLastname() != null &&
                        item.getAddress() != null)
                .sorted((item1, item2) -> item1.getAddress().getHomeNumber() - item2.getAddress().getHomeNumber())
                .map(item -> item.toString())
                .collect(Collectors.toList());

        for(String item : list) {
            System.out.println(item);
        }
    }
}
