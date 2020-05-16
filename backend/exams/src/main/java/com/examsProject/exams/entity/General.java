/*
package com.examsProject.exams.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "general")
public class General {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long general_id;

    private String major;

    private int study_year;

    @OneToMany(mappedBy = "general")
    public Set<Planning> planning;

    public General(Long general_id, String major, int study_year) {
        this.general_id = general_id;
        this.major = major;
        this.study_year = study_year;
    }

    public Long getGeneral_id() {
        return general_id;
    }

    public String getMajor() {
        return major;
    }

    public int getStudy_year() {
        return study_year;
    }

    public void setGeneral_id(Long general_id) {
        this.general_id = general_id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudy_year(int study_year) {
        this.study_year = study_year;
    }

    @Override
    public String toString() {
        return "General{" +
                "general_id=" + general_id +
                ", major='" + major + '\'' +
                ", study_year=" + study_year +
                '}';
    }
}
*/