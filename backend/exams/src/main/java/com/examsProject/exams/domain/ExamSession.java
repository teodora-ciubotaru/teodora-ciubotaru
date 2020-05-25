package com.examsProject.exams.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam_session")
public class ExamSession {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int sessionId;

  private String examSession;

  private String academicYear;

  public int getSessionId() {
    return sessionId;
  }

  public void setSessionId(int sessionId) {
    this.sessionId = sessionId;
  }

  public String getExamSession() {
    return examSession;
  }

  public void setExamsSession(String examSession) {
    this.examSession = examSession;
  }

  public String getAcademicYear() {
    return academicYear;
  }

  public void setAcademicYear(String academicYear) {
    this.academicYear = academicYear;
  }
}