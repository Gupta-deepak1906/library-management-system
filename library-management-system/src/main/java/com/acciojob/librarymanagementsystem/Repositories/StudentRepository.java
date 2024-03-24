package com.acciojob.librarymanagementsystem.Repositories;

import com.acciojob.librarymanagementsystem.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends JpaRepository<Student,Integer> {
}
