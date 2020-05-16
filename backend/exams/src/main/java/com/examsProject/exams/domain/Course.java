package com.examsProject.exams.domain;

//@Entity
//@Table(name = "courses")
class Course {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseName;

    public Course() {}

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /*@Override
    public String toString() {
        return "Courses{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                '}' + '\n';
    }*/
}
