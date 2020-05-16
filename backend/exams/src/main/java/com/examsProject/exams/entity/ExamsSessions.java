/*
package com.examsProject.exams.entity;

import javax.persistence.*;

@Entity
@Table(name = "exams_sessions")
public class ExamsSessions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long session_id;

    private String exam_session;

    private String academic_year;

    public ExamsSessions(Long session_id, String exam_session, String academic_year) {
        this.session_id = session_id;
        this.exam_session = exam_session;
        this.academic_year = academic_year;
    }

    public Long getSession_id() {
        return session_id;
    }

    public String getExam_session() {
        return exam_session;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public void setExam_session(String exam_session) {
        this.exam_session = exam_session;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    @Override
    public String toString() {
        return "ExamsSessions{" +
                "session_id=" + session_id +
                ", exam_session='" + exam_session + '\'' +
                ", academic_year='" + academic_year + '\'' +
                '}';
    }
}
*/