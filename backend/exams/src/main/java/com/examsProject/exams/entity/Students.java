/*
package com.examsProject.exams.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long student_id;

    private String student_name;

    private String email;

    private String password;

    private boolean access_level;

    @ManyToOne
    @JoinColumn(name = "general_id")
    private Long general_id;


    public Students(Long student_id, String student_name, String email, String password, boolean access_level, Long general_id) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.email = email;
        this.password = password;
        this.access_level = access_level;
        this.general_id = general_id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
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

    public boolean isAccess_level() {
        return access_level;
    }

    public void setAccess_level(boolean access_level) {
        this.access_level = access_level;
    }

    public Long getGeneral_id() {
        return general_id;
    }

    public void setGeneral_id(Long general_id) {
        this.general_id = general_id;
    }
}
*/