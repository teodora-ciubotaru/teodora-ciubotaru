package com.examsProject.exams.domain;

import javax.persistence.*;

@Entity
@Table(name = "exam_session")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subjectExam;
    private String teacher;
    private int universityYear;
    private String section;
    private int semester;
    private int studyYear;
    private String classroom;
    private java.sql.Timestamp date;
    private int numberOfSeats;

    public Exam(int id, String subjectExam, String teacher, int universityYear, String section, int semester, int studyYear, String classroom, java.sql.Timestamp date, int numberOfSeats) {
        this.id = id;
        this.subjectExam = subjectExam;
        this.teacher = teacher;
        this.universityYear = universityYear;
        this.section = section;
        this.semester = semester;
        this.studyYear = studyYear;
        this.classroom = classroom;
        this.date = date;
        this.numberOfSeats = numberOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectExam() {
        return subjectExam;
    }

    public void setSubjectExam(String subjectExam) {
        this.subjectExam = subjectExam;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(int universityYear) {
        this.universityYear = universityYear;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public java.sql.Timestamp getDate() {
        return date;
    }

    public void setDate(java.sql.Timestamp date) {
        this.date = date;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
