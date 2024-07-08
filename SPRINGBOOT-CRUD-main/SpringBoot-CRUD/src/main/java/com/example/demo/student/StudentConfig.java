package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    private List<Student> studentList;

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mahmudul = new Student(
                    "kumar",
                    LocalDate.of(1998, Month.FEBRUARY, 10),
                    "kumar@gmail.com"
            );
            Student talia = new Student(
                    "jyothi",
                    LocalDate.of(1997, Month.JUNE, 11),
                    "jyothi@gmail.com"
            );
            studentList = new ArrayList<>();
            studentList.add(kumar);
            studentList.add(jyothi);
            repository.saveAll(studentList);
        };
    }
}
