package com.examsProject.exams.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @RequestMapping("/courses")
    public List<Courses> getAllCourses()
    {
        return coursesService.getAllCourses();
    }

    //error ambiguous path
    @RequestMapping("/courses/{id}")
    public Courses getCourseId(@PathVariable Long id)
    {
        return coursesService.getCourseId(id);
    }

    //error ambiguous path
    @RequestMapping("/courses/{course_name}")
    public Courses getCourseName(@PathVariable String course_name)
    {
        return coursesService.getCourseName(course_name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourses(@RequestBody Courses course)
    {
        coursesService.addCourses(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void updateCourses(@RequestBody Courses course, @PathVariable Long id)
    {
        coursesService.updateCourses(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourses(@PathVariable Long id)
    {
        coursesService.deleteCourse(id);
    }

}
