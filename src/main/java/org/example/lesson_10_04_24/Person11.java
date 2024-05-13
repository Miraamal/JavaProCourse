package org.example.lesson_10_04_24;

public class Person11 {

    private String name;
    private Address address;
}


class Address {
    private Country country;

    public static void main(String[] args) {
        Country USA = Country.USA;
    }
}

enum Country {
    USA,
    SPAIN,
    UKRAINE,
    NEW_ZEALAND
}
