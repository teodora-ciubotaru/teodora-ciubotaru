package com.examsProject.exams.controller;

import com.examsProject.exams.domain.General;
import com.examsProject.exams.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GeneralController {

    @Autowired
    private GeneralService generalService;


    @RequestMapping("/generals")
    public List<General> getAllgenerals()
    {
        return generalService.getAllGenerals();
    }

    /*error ambiguous path + eroare din CoursesService
    @RequestMapping("/courses/{id}")
    public Courses getCourseId(@PathVariable Long id)
    {
        return coursesService.getCourseId(id);
    }

    error ambiguous path
    @RequestMapping("/courses/{course_name}")
    public Courses getCourseName(@PathVariable String course_name)
    {
        return coursesService.getCourseName(course_name);
    }
    */


    @RequestMapping(method = RequestMethod.POST, value = "/generals")
    public void addGeneral(@RequestBody General general)
    {
        generalService.addGeneral(general);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/general/{id}")
    public void updategeneral(@RequestBody General general, @PathVariable int id)
    {
        generalService.updateGeneral(id, general);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/general/{id}")
    public void deletegeneral(@PathVariable int id)
    {
        generalService.deleteGeneral(id);
    }

}
