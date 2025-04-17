package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Student;

//public interface StudentRepository extends JpaRepository <Student,Id>{
//
//}

public interface StudentRepository extends JpaRepository<Student, Long> {
}
