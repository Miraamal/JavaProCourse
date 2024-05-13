package org.example._07_05_24.tasks.school;
/*
Задание 5: Расширенные операции с POJO классами
Тема: Сложные манипуляции и агрегации данных.
Описание: Реализуйте функционал для расчета статистики по курсам:
например, вычисление среднего возраста студентов на каждом курсе.

 */
public class Statistics {
    public int  getAverageAge(Course course){
        int sum = 0;
        for (Student s : course.getStudents()) {
            sum = sum + s.getAge();
        }
        return sum/course.getStudents().size(); // metod dlya naxojdeniya srednego vozrasta
    }
}
