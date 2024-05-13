package org.example.lesson_17_04_24.ex1;

import java.util.ArrayList;
import java.util.List;

public class Device {
    public static void main(String[] args) {
        List<Device> devices= new ArrayList<>();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        devices.add(keyboard);
        devices.add(mouse);

        for (int i = 0; i < devices.size(); i++) {
            Device device = devices.get(i);
            if(device instanceof Keyboard) {
                Keyboard keyboard1 = (Keyboard) device;






                System.out.println("KEY");
            } else if(device instanceof Mouse) {
                System.out.println("MOUSE");
            }
        }
    }
}

class Keyboard extends Device {

}

class Mouse extends Device {

}



