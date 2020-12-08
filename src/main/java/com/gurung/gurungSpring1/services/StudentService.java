package com.gurung.gurungSpring1.services;

import com.gurung.gurungSpring1.models.StudentModel;
import com.gurung.gurungSpring1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<StudentModel> getStudents()
    {
        return studentRepository.findAll();
    }

    public StudentModel saveStudent(StudentModel studentModel)
    {
        return studentRepository.save(studentModel);
    }

}
