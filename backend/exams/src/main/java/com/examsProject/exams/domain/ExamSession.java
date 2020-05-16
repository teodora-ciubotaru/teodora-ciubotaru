package com.examsProject.exams.domain;

import javax.persistence.*;

@Entity
@Table(name = "exam_sessions")
class ExamSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sessionId;

    private String examsSession;
    private String academicYear;

    public ExamSession() {}

    public ExamSession(String examsSession, String academicYear) {
        this.examsSession = examsSession;
        this.academicYear = academicYear;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getExamsSession() {
        return examsSession;
    }

    public void setExamsSession(String examsSession) {
        this.examsSession = examsSession;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }
}
