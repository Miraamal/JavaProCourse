package org.example.lesson_03_05_24.deque_task;

import java.util.ArrayDeque;
import java.util.Deque;

public class RollingStock {
    private Deque<Carriage>carriages;

    public RollingStock() {
        this.carriages = new ArrayDeque<>();
    }
    public void addFirstCarriages(Carriage carriage){
        carriages.addFirst(carriage);
    }
    public void addLastCarriages(Carriage carriage){
        carriages.addLast(carriage);
    }

    public Carriage unhookFirstOne(){
      return  carriages.removeFirst();
    }

    public Carriage unhookLastOne(){
        return  carriages.removeLast();
    }
    public boolean isEmpty(){
        return carriages.isEmpty();
    }
}
