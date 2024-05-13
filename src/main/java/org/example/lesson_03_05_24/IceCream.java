package org.example.lesson_03_05_24;

import org.example.lesson_03_05_24.sweet.Cone;
import org.example.lesson_03_05_24.sweet.IceCreamBall;
import org.example.lesson_03_05_24.sweet.Taster;

/*
Создайте класс Рожок для мороженого.
 Создайте класс Шарик мороженого, содержащий поле Вкус.
 При создании объекта Рожок указывается, сколько шариков в него помещается.
 В программе создайте рожок на три шарика, положите в него три шарика с разными вкусами.
 Создайте класс Дегустатор мороженого.
 В классе создайте метод, который принимает рожок мороженного,
 съедает их и сообщает, шарик с каким вкусом был съеден.
 Дегустатор может есть шарики только в порядке, обратном порядку складывания шариков в рожок.
 Какую коллекцию нужно использовать для хранения шариков в рожке?
 */
public class IceCream {
    public static void main(String[] args) {
        IceCreamBall ice1= new IceCreamBall("Vanilla");
        IceCreamBall ice2= new IceCreamBall("Strawberry");
        IceCreamBall ice3= new IceCreamBall("Pistacchio");

        Cone cone = new Cone();
        cone.putBall(ice1);
        cone.putBall(ice2);
        cone.putBall(ice3);

        Taster taster = new Taster();
        taster.tasteIce(cone);
    }

}
