package com.examsProject.exams.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "professor")
public class Professor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer professorId;

  private String professorName;

  public int getProfessorId() {
    return professorId;
  }

  public void setProfessorId(int professorId) {
    this.professorId = professorId;
  }

  public String getProfessorName() {
    return professorName;
  }

  public void setProfessorName(String professorName) {
    this.professorName = professorName;
  }
}
