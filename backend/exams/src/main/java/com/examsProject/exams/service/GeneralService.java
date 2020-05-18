package com.examsProject.exams.service;

import com.examsProject.exams.domain.General;
import com.examsProject.exams.repository.GeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GeneralService {

    @Autowired
    private GeneralRepository generalRepository;

    public List<General> getAllGenerals()
    {
        return generalRepository.findAll();
    }

    /*returneaza un curs dupa id
    public General getCourseId(Long id) {
        //return courses.stream().filter(c -> c.getCourse_id().equals(id)).findFirst().get();
        return generalRepository.findOne(id);
    }*/

    /*
    public Courses getCourseName(String course_name) {
        return courses.stream().filter(c -> c.getCourse_name().equals(course_name)).findFirst().get();
    }*/



    public void addGeneral(General general) {
        generalRepository.save(general);
    }

    public void updateGeneral(int id, General general)
    {
        generalRepository.save(general);
    }

    public void deleteGeneral(int id)
    {
        generalRepository.deleteById(id);
    }
}
