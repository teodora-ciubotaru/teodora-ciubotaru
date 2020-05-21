package com.examsProject.exams.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "courses")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int courseId;

  private String courseName;

  public int getCourseId() {
    return courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
}
