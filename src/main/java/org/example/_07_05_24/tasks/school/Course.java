package org.example._07_05_24.tasks.school;
/*
Задание 2: Расширение функциональности POJO класса
Тема: Взаимодействие между POJO классами.
Описание: Расширьте предыдущее задание, добавив новый класс
Course, который содержит название курса и список студентов,
записанных на курс. Студенты должны быть представлены в виде
списка экземпляров класса Student.

 */
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@ToString

public class Course {
    private String courseName;
    private List<Student> students;


    public Course(String courseName){
        setCourseName(courseName);
        this.students = new ArrayList<>();

    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.isBlank())
            throw new IllegalArgumentException("Course name can't be empty");
        this.courseName = courseName;
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void removeStudent(Student student) {

        students.remove(student);
    }


}

