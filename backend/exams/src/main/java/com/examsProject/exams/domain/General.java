package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "general")
public class General {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int generalId;

    private String major;
    private int studyYear;

    @OneToMany(mappedBy = "general")
    public List<Planning> plannings;

    public General() {}

    public General(int generalId, String major, int studyYear, List<Planning> plannings)
    {
        this.generalId = generalId;
        this.major = major;
        this.studyYear = studyYear;
        this.plannings = plannings;
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
}
