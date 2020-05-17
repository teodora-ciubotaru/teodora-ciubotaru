package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "exam_sessions")
public class ExamSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sessionId;

    private String examSession;
    private String academicYear;

    @OneToMany(mappedBy = "session")
    private List<Planning> planning;

    public ExamSession() {}

    public ExamSession(String examSession, String academicYear, List<Planning> planning)
    {
        this.examSession = examSession;
        this.academicYear = academicYear;
        this.planning = planning;
    }

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

    public List<Planning> getPlanning() {
        return planning;
    }

    public void setPlanning(List<Planning> planning) {
        this.planning = planning;
    }
}