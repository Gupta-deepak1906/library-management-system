package com.acciojob.librarymanagementsystem.Entities;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
//import lombok.Getter;

@Entity //this is the schema of how student table look like
@Table
//@Getter
//@Setter
//@NoArgsConstructor //this is like a default constructor
//@AllArgsConstructor //this is like a constructor havinf all the argrument
public class Student {

    @Id // act as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int rollId;
    private String name;
    private Integer age;
    private String branch;
    private double cgpa;

    private String emailId;

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Student(int rollId, String name, Integer age, String branch, double cgpa, String emailId) {
        this.rollId = rollId;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;
        this.emailId = emailId;
    }
}