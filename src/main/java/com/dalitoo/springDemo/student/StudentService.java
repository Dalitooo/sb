package com.dalitoo.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("Dali","BenSalem", LocalDate.now(),"Dali@test.com",25),
                new Student("Dalo","BenSalem", LocalDate.now(),"Dali@test.com",25)
        );
    }

}
