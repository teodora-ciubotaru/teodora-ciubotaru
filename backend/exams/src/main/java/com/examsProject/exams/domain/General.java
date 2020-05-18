package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
//@Table(name = "general")
public class General {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int generalId;

    private String major;
    private int studyYear;

    @OneToMany(mappedBy = "general")
    public List<Student> students;

    @OneToMany(mappedBy = "general")
    public List<Planning> plannings;

    public General() {}

    public General(int generalId, String major, int studyYear, List<Planning> plannings, List<Student> students)
    {
        this.generalId = generalId;
        this.major = major;
        this.studyYear = studyYear;
        this.plannings = plannings;
        this.students = students;
    }

    public int getGeneralId() {
        return generalId;
    }

    public void setGeneralId(int generalId) {
        this.generalId = generalId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public List<Planning> getPlanning() {
        return plannings;
    }

    public void setPlanning(List<Planning> plannings) {
        this.plannings = plannings;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> students) {
        this.students = students;
    }


}
