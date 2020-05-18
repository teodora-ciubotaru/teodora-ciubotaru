package com.examsProject.exams.service;

import com.examsProject.exams.domain.Course;
import com.examsProject.exams.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

   public List<Course> getAllCourses()
   {
       return courseRepository.findAll();
    }

    //returneaza un curs dupa id
  public Optional<Course> getCourseId(int id)
  {
      return courseRepository.findById(id);
  }
/*
    public Courses getCourseName(String course_name) {
        return courses.stream().filter(c -> c.getCourse_name().equals(course_name)).findFirst().get();
    }*/


    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(int id, Course course)
    {
       courseRepository.save(course);
    }

    public void deleteCourse(int id)
    {
        courseRepository.deleteById(id);
    }
}
