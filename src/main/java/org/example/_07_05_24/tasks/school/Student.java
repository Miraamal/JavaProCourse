package org.example._07_05_24.tasks.school;
/*
task1
Задание 1: Создание базового POJO класса
  Тема: Основы POJO (Plain Old Java Object).
        Описание: Создайте класс Student, который содержит базовые поля:
        имя, фамилия, возраст. Добавьте геттеры и сеттеры для каждого поля,
        а также переопределите методы toString(), equals() и hashCode().

 */

import lombok.*;
import org.example._07_05_24.tasks.school.Course;

import java.util.ArrayList;
import java.util.List;

@ToString(exclude="courses")
@EqualsAndHashCode
@Getter

public class Student {
    @Setter
    private String name;
    @Setter
    private String surname;
    private int age;
    private List<Course> courses;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
        courses = new ArrayList<>();
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age can't be  negative");
        this.age = age;
    }

   public void addCourse(Course course){
        courses.add(course);
        course.addStudent(this);
   }
   public void removeCourse(Course course){
        courses.remove(course);
        course.removeStudent(this);
   }
}


