package org.example.lesson_03_05_24.deque_task;

public class Train {
    private int id;

    public int getId() {
        return id;
    }

    public Train(int id) {
        this.id = id;
    }
    public void getFirstCarriage(RollingStock rollingStock){
        System.out.printf("Train %d unhooked carriage %d%n ", this.id, rollingStock.unhookFirstOne().getId());
    }
    public void getLastCarriage(RollingStock rollingStock){
        System.out.printf("Train %d unhooked carriage %d%n ", this.id, rollingStock.unhookLastOne().getId());
    }
}
