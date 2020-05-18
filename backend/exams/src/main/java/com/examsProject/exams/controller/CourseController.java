package com.examsProject.exams.controller;

import com.examsProject.exams.domain.Course;
import com.examsProject.exams.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseId(@PathVariable int id)
    {
        return courseService.getCourseId(id);
    }

    /*error ambiguous path
    @RequestMapping("/courses/{course_name}")
    public Courses getCourseName(@PathVariable String course_name)
    {
        return coursesService.getCourseName(course_name);
    }
    */

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse(@RequestBody Course course)
    {
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable int id)
    {
        courseService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable int id)
    {
        courseService.deleteCourse(id);
    }

}
