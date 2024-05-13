package org.example.lesson_03_05_24.sweet;

public class Taster {
    public void tasteIce (Cone cone){
        while (!cone.isEmpty()){
            IceCreamBall ball = cone.takeBall();
            System.out.println("I tasted " + ball.getTaste());
        }
    }
}
