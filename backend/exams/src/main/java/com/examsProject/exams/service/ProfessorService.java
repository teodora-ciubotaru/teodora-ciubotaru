package com.examsProject.exams.service;


import com.examsProject.exams.domain.Professor;
import com.examsProject.exams.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors()
    {
        return professorRepository.findAll();
    }

    /* returneaza un curs dupa id
    public Courses getCourseId(Long id) {
        //return courses.stream().filter(c -> c.getCourse_id().equals(id)).findFirst().get();
        return professorRepository.findOne(id);
    }

    public Courses getCourseName(String course_name) {
        return courses.stream().filter(c -> c.getCourse_name().equals(course_name)).findFirst().get();
    }
     */

    public void addProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    public void updateProfessor(int id, Professor professor)
    {
        professorRepository.save(professor);
    }

    public void deleteProfessor(int id)
    {
        professorRepository.deleteById(id);
    }
}
