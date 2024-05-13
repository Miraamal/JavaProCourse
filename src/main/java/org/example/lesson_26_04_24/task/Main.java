package org.example.lesson_26_04_24.task;



import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("patients"));
        List<String>readList=new ArrayList<>();
        while (scanner.hasNextLine()){
            readList.add(scanner.nextLine());
        }
        System.out.println(readList);
        List<Patient>patients=new ArrayList<>();
        for (String info : readList) {
            patients.add(PatientParser.parse(info));
        }
        System.out.println();
        System.out.println(patients);
    }
}
