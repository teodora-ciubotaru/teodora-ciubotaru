package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "planning")
class Planning {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int planningId;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private ExamSession sessions;

    @ManyToOne
    @JoinColumn(name = "general_id")
    private General general;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professors;

    private int numberOfSeats;
    private Date examDate;
    private String classroom;

    public Planning() {}

    public Planning(ExamSession sessions, General general, Course courses, Professor professors, int numberOfSeats, Date examDate, String classroom) {
        this.sessions = sessions;
        this.general = general;
        this.courses = courses;
        this.professors = professors;
        this.numberOfSeats = numberOfSeats;
        this.examDate = examDate;
        this.classroom = classroom;
    }

    public int getPlanningId() {
        return planningId;
    }

    public void setPlanningId(int planningId) {
        this.planningId = planningId;
    }

    public ExamSession getSessions() {
        return sessions;
    }

    public void setSessions(ExamSession sessions) {
        this.sessions = sessions;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public Professor getProfessors() {
        return professors;
    }

    public void setProfessors(Professor professors) {
        this.professors = professors;
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
