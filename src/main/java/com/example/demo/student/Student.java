package com.example.demo.student;
import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate birth_day;
    private Integer age;

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate birth_day,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth_day = birth_day;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirth_day() {
        return birth_day;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth_day=" + birth_day +
                ", age=" + age +
                '}';
    }
}
