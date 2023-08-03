package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {
    private StudentController studentController;
    @Autowired
    public StudentController(StudentController studentController) {
        this.studentController = studentController;
    }

    @GetMapping
    public List<Student> getStudents()
    {
    return studentController.getStudents();
    }

}
