package com.example.microservicestest.repository;

import com.example.microservicestest.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
