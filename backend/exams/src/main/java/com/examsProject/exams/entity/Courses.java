
package com.examsProject.exams.entity;

import javax.persistence.*;

//@Entity
//@Table(name = "courses")
public class Courses {

   // @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long course_id;

    private String course_name;

    public Courses() {}

    public Courses(Long course_id, String course_name) {
        this.course_id = course_id;
        this.course_name = course_name;
    }

    public Long getCourse_id(){
        return course_id;
    }

    public String getCourse_name(){
        return  course_name;
    }

    public void setCourse_id(Long course_id){
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name){
        this.course_name = course_name;
    }

    /*@Override
    public String toString() {
        return "Courses{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                '}' + '\n';
    }*/
}
