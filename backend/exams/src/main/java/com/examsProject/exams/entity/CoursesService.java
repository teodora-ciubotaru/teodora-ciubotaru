package com.examsProject.exams.entity;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CoursesService {

    private List<Courses> courses = new ArrayList<>(Arrays.asList(
            new Courses((long) 1, "Baze de date"),
            new Courses((long) 2, "Inginerie software"),
            new Courses((long) 3, "Probabilitati si statistica"),
            new Courses((long) 4, "CDI")
    ));

    public List<Courses> getAllCourses() {
        return courses;
    }

    public Courses getCourseId(Long id) {
        return courses.stream().filter(c -> c.getCourse_id().equals(id)).findFirst().get();
    }

    public Courses getCourseName(String course_name) {
        return courses.stream().filter(c -> c.getCourse_name().equals(course_name)).findFirst().get();
    }

    public void addCourses(Courses course) {
        courses.add(course);
    }

    public void updateCourses(Long id, Courses course)
    {
        for(int i = 0; i < courses.size(); i++)
        {
            Courses c = courses.get(i);
            if(c.getCourse_id().equals(id))
            {
                courses.set(i, course);
                return;
            }
        }
    }

    public void deleteCourse(Long id)
    {
        courses.removeIf(c -> c.getCourse_id().equals(id));
    }
}
