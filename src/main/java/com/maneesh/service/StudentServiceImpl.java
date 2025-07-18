package com.maneesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maneesh.model.Student;
import com.maneesh.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository sr;

    public List<Student> getAllStudents() {
        return sr.findAll();
    }

    public Student getStudentById(Long id) {
        return sr.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student createStudent(Student student) {
        return sr.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());
        return sr.save(student);
    }

    public String deleteStudent(Long id) {
    	Student student =getStudentById(id);
    	if(student!=null) {
        sr.deleteById(id);
        return "Book is Deleted";
    	}
    	return "Book is not their";
    }


	
}