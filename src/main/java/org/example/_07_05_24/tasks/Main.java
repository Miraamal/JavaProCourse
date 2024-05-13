package org.example._07_05_24.tasks;

import org.example._07_05_24.tasks.school.Course;
import org.example._07_05_24.tasks.school.Statistics;
import org.example._07_05_24.tasks.school.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", "Ivanov", 18);
        Student student2 = new Student("John", "Scott", 19);
        Student student3 = new Student("Marry", "Trump", 20);

        Course course = new Course("Java pro");
        student1.addCourse(course);
        student2.addCourse(course);
        student3.addCourse(course);
        System.out.println(course);
        Statistics statistics = new Statistics();
        System.out.println(statistics.getAverageAge(course));
    }

}
