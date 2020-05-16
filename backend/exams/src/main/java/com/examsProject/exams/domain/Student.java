package com.examsProject.exams.domain;

import javax.persistence.*;

@Entity
@Table(name = "students")
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    private String studentName;
    private String email;
    private String password;
    private int accessLevel;

    @ManyToOne
    @JoinColumn(name = "general_id")
    private int generalId;

    public Student() {}

    public Student(String studentName, String email, String password, int accessLevel, int generalId) {
        this.studentName = studentName;
        this.email = email;
        this.password = password;
        this.accessLevel = accessLevel;
        this.generalId = generalId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getGeneralId() {
        return generalId;
    }

    public void setGeneralId(int generalId) {
        this.generalId = generalId;
    }
}
