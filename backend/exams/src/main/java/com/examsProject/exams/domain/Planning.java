package com.examsProject.exams.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Table(name = "planning")
public class Planning {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int planningId;

  @ManyToOne
  @JoinColumn(name = "session_id")
  private ExamSession session;

  @ManyToOne
  @JoinColumn(name = "general_id")
  private General general;

  @ManyToOne
  @JoinColumn(name = "course_id")
  private Course course;

  @ManyToOne
  @JoinColumn(name = "professor_id")
  private Professor professor;

  private int numberOfSeats;

  private Date examDate;

  private String classroom;

  public int getPlanningId() {
    return planningId;
  }

  public void setPlanningId(int planningId) {
    this.planningId = planningId;
  }

  public ExamSession getSession() {
    return session;
  }

  public void setSession(ExamSession session) {
    this.session = session;
  }

  public General getGeneral() {
    return general;
  }

  public void setGeneral(General general) {
    this.general = general;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Professor getProfessors() {
    return professor;
  }

  public void setProfessors(Professor professor) {
    this.professor = professor;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public Date getExamDate() {
    return examDate;
  }

  public void setExamDate(Date examDate) {
    this.examDate = examDate;
  }

  public String getClassroom() {
    return classroom;
  }

  public void setClassroom(String classroom) {
    this.classroom = classroom;
  }
}
