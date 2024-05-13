package org.example.lesson_26_04_24.task;

import lombok.Getter;
import lombok.Setter;



import java.time.LocalDate;

public class Patient {
    private long id;
    private String name;
    private String surName;

    private LocalDate dateOfBirth;

    public Patient(long id, String name, String surName, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
