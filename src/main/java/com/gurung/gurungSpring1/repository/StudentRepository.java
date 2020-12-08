package com.gurung.gurungSpring1.repository;

import com.gurung.gurungSpring1.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> {
}
