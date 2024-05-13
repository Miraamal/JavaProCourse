package org.example.lesson_10_04_24.exp_1;


import lombok.NonNull;

public class Example {

    /**
     *
     * @param animal input parameter
     */
    public static void get(@NonNull InterEx animal) {

    }

    public static void main(String[] args) {
        get(new Animal());
        InterEx interEx = new Animal();
        InterEx.getINTER();
    }
}
