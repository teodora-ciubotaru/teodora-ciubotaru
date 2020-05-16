/*
package com.examsProject.exams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "planning")
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long planning_id;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private int session_id;

    @ManyToOne
    @JoinColumn(name = "general_id")
    private General general_id;
    //private int general_id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course_id;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professors professor_id;

    private int number_of_seats;

    private Date exam_date;



    public Long getPlanning_id() {
        return planning_id;
    }

    public void setPlanning_id(Long planning_id) {
        this.planning_id = planning_id;
    }

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public General getGeneral_id() {
        return general_id;
    }

    /*public int getGeneral_id(){
        return general_id;
    }

    public void setGeneral_id(General general_id) {
        this.general_id = general_id;
    }

    /*public void setGeneral_id(int general_id){
        this.general_id = general_id;
    }

    public Courses getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Courses course_id) {
        this.course_id = course_id;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public Date getExam_date() {
        return exam_date;
    }

    public void setExam_date(Date exam_date) {
        this.exam_date = exam_date;
    }



    public Planning(Long planning_id, int session_id, General general_id, Courses course_id, Professors professor_id, int number_of_seats, Date exam_date) {
        this.planning_id = planning_id;
        this.session_id = session_id;
        this.general_id = general_id;
        this.course_id = course_id;
        this.professor_id = professor_id;
        this.number_of_seats = number_of_seats;
        this.exam_date = exam_date;
    }
}
*/