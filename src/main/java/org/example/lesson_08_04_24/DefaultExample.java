package org.example.lesson_08_04_24;

public class DefaultExample implements InterAA, InterBB{
    @Override
    public void get() {

    }

//    @Override
//    public void showInfo() {
//        InterBB.super.showInfo();
//    }

    @Override
    public void run() {

    }
}


interface InterAA {
    void get();

    default void showInfo() {
        System.out.println("InterAA");
    }
}

interface  InterBB {
    void run();

//    default void showInfo() {
//        System.out.println("InterBB");
//    }
}


