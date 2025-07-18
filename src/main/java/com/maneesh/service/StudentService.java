package com.maneesh.service;

import java.util.List;

import com.maneesh.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    String deleteStudent(Long id);
}