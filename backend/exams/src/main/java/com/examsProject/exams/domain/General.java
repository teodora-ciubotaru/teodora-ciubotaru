package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "general")
class General {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int generalId;

    private String major;
    private int studyYear;

    @OneToMany(mappedBy = "general")
    public Set<Planning> planning;

    public General() {}

    public General(int generalId, String major, int studyYear, Set<Planning> planning) {
        this.generalId = generalId;
        this.major = major;
        this.studyYear = studyYear;
        this.planning = planning;
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

    public Set<Planning> getPlanning() {
        return planning;
    }

    public void setPlanning(Set<Planning> planning) {
        this.planning = planning;
    }
}
