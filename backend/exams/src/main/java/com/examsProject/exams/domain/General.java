package com.examsProject.exams.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
//@Table(name = "general")
public class General {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int generalId;

  private String major;

  private int studyYear;

  // Desi nu e ok din pct de vedere al performantei, pt aceasta practica e de
  // ajuns :).
  // Daca vrei sa faci corect si performant iti recomand sa citesti:
  // https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/
  @OneToMany
  @JoinColumn(name = "general_id")
  private List<Student> students = new ArrayList<Student>();

  public int getGeneralId() {
    return generalId;
  }

  public void setGeneralId(int generalId) {
    this.generalId = generalId;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public int getStudyYear() {
    return studyYear;
  }

  public void setStudyYear(int studyYear) {
    this.studyYear = studyYear;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

}
