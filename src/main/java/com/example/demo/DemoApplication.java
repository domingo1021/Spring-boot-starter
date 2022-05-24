package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello world";
	}
	@GetMapping("/list-hello")
	public List<Student> hello_list(){
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
