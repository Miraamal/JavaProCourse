package org.example.lesson_10_04_24.exp_2;

import lombok.Getter;

@Getter
public class House {
    private String streetName;
    private int flatNumber;
    private Flat[] flats;
}

@Getter
class Flat {
    private int number;
    private Room[] rooms;
}

@Getter
class Room {
    int w;
    int l;
    int h;
}

class Testt {
//    public Room[] getRoomsByVolume(House[] houses, double volume) {
//        List<Room> roomList = new ArrayList<>();
//
//        for (int i = 0; i < houses.length; i++) {
//            House house = houses[i];
//            Flat[] flats = house.getFlats();
//            for (int j = 0; j < flats.length; j++) {
//                if(flats[i])
//            }
//        }
//    }
}

