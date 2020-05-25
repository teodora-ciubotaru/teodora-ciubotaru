package com.examsProject.exams.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int studentId;

  private String studentName;

  private String email;

  private String password;

  private boolean accessLevel;

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

  public boolean getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(boolean accessLevel) {
    this.accessLevel = accessLevel;
  }

}
