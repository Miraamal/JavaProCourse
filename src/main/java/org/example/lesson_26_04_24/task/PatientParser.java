package org.example.lesson_26_04_24.task;

import java.time.LocalDate;

public class PatientParser {

    private PatientParser() {
    }
    public static Patient parse(String info){
       String[] data = info.split(" ");
       return new Patient(Long.parseLong(data[0]),data[1],data[2], LocalDate.parse(data[3]));
    }
}
