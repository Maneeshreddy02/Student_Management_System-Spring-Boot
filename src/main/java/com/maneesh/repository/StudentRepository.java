package com.maneesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maneesh.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
