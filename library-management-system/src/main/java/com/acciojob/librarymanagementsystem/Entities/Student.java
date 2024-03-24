package com.acciojob.librarymanagementsystem.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //this is the schema of how student table look like
@Table
public class Student {

    @Id // act as a primary key
    private int studentId;
    private String studentNAme;
    private Integer age;
    private String course;

    private String emails;

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentNAme() {
        return studentNAme;
    }

    public void setStudentNAme(String studentNAme) {
        this.studentNAme = studentNAme;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
