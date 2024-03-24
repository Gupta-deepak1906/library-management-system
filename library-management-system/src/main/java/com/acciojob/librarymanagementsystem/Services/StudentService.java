package com.acciojob.librarymanagementsystem.Services;

import com.acciojob.librarymanagementsystem.Entities.Student;
import com.acciojob.librarymanagementsystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
public String addStudent(Student student){
studentRepository.save(student);
return "Student has been save  to DB";
}
}
