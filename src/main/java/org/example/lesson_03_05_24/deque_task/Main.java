package org.example.lesson_03_05_24.deque_task;

public class Main {
    public static void main(String[] args) {
        Carriage carriage1 = new Carriage(1);
        Carriage carriage2 = new Carriage(2);
        Carriage carriage3 = new Carriage(3);
        Carriage carriage4 = new Carriage(4);
        Carriage carriage5 = new Carriage(5);

        RollingStock rollingStock = new RollingStock();
        rollingStock.addLastCarriages(carriage1);
        rollingStock.addLastCarriages(carriage2);
        rollingStock.addLastCarriages(carriage3);
        rollingStock.addLastCarriages(carriage4);
        rollingStock.addLastCarriages(carriage5);

        Train train1 = new Train(1);
        Train train2 = new Train(2);
        while (!rollingStock.isEmpty()){
            train1.getFirstCarriage(rollingStock);
            if (rollingStock.isEmpty()){
                break;
            }
            train2.getLastCarriage(rollingStock);
        }

    }
}

