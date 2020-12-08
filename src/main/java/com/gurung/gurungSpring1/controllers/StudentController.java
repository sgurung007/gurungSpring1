package com.gurung.gurungSpring1.controllers;

import com.gurung.gurungSpring1.models.StudentModel;
import com.gurung.gurungSpring1.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/students")
    public List<StudentModel> getStudents()
    {
        return studentService.getStudents();
    }
    
    @PostMapping("/student")
    public StudentModel saveStudent(@RequestBody StudentModel studentModel)
    {
        return studentService.saveStudent(studentModel);
    }
}
