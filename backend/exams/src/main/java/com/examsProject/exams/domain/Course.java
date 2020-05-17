package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;

    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<Planning> plannings;

    public Course() {}

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        //this.plannings = plannigns;
    }

    public int getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return  courseName;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public List<Planning> getPlanning() {
        return plannings;
    }

    public void setPlanning(List<Planning> plannings) {
        this.plannings = plannings;
    }
}
