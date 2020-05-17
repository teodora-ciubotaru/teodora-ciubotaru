package com.examsProject.exams.domain;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer professorId;

    private String professorName;

    @OneToMany(mappedBy = "professor")
    private List<Planning> plannings;

    public Professor() {}

    public Professor(int professorId, String professorName, List<Planning> plannings) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.plannings = plannings;
    }

    public Professor(String professorName) {
        this.professorName = professorName;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public List<Planning> getPlanning() {
        return plannings;
    }

    public void setPlanning(List<Planning> plannings) {
        this.plannings = plannings;
    }
}
