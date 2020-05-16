package com.examsProject.exams.domain;

import javax.persistence.*;

@Entity
@Table(name = "professors")
class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int professorId;

    private String professorName;

    public Professor() {}

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
}
