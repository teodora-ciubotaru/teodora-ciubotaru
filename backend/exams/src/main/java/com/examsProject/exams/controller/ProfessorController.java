package com.examsProject.exams.controller;

import com.examsProject.exams.domain.Professor;
import com.examsProject.exams.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @RequestMapping("/professors")
    public List<Professor> getAllProfessors()
    {
        return professorService.getAllProfessors();
    }

    /*error ambiguous path + eroare din CoursesService
    @RequestMapping("/courses/{id}")
    public Courses getCourseId(@PathVariable Long id)
    {
        return coursesService.getCourseId(id);
    }*/

    /*error ambiguous path
    @RequestMapping("/courses/{course_name}")
    public Courses getCourseName(@PathVariable String course_name)
    {
        return coursesService.getCourseName(course_name);
    }
    */

    @RequestMapping(method = RequestMethod.POST, value = "/professors")
    public void addProfessor(@RequestBody Professor professor)
    {
        professorService.addProfessor(professor);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/professor/{id}")
    public void updateProfessor(@RequestBody Professor professor, @PathVariable int id)
    {
        professorService.updateProfessor(id, professor);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/professor/{id}")
    public void deleteProfessor(@PathVariable int id)
    {
        professorService.deleteProfessor(id);
    }

}
