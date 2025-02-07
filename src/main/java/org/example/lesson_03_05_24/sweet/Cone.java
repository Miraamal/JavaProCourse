package org.example.lesson_03_05_24.sweet;

import java.util.Stack;

public class Cone {
    private Stack<IceCreamBall> balls;

    public void putBall(IceCreamBall ball){
        balls.add(ball);
    }
    public IceCreamBall takeBall(){
        return balls.pop();
    }
    public boolean isEmpty(){
        return balls.isEmpty();
    }

    public Cone() {
        balls= new Stack<>();
    }
}
