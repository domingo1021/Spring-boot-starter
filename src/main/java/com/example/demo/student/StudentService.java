package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        // return with a json List format.
        return List.of(
                new Student(
                        107306075L,
                        "Tsao",
                        "domingo0204@gmail.com",
                        LocalDate.of(2000, Month.OCTOBER, 21),
                        21
                )
        );
    }
}
