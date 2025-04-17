package com.example.repository.copy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Student;
import jakarta.persistence.Id;

//public interface StudentRepository extends JpaRepository <Student,Id>{
//
//}

public interface StudentRepository extends JpaRepository<Student, Long> {
}
