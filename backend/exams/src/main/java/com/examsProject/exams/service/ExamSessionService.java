package com.examsProject.exams.service;

import com.examsProject.exams.domain.ExamSession;
import com.examsProject.exams.repository.ExamSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamSessionService {

    @Autowired
    private ExamSessionRepository examSessionRepository;

    public List<ExamSession> getAllExamSessions()
    {

        return examSessionRepository.findAll();

    }

    /* returneaza un curs dupa id
    public Courses getCourseId(Long id) {
        //return courses.stream().filter(c -> c.getCourse_id().equals(id)).findFirst().get();
        return examSessionRepository.findOne(id);
    }

    public Courses getCourseName(String course_name) {
        return courses.stream().filter(c -> c.getCourse_name().equals(course_name)).findFirst().get();
    }
     */

    public void addExamSession(ExamSession examSession) {
        examSessionRepository.save(examSession);
    }

    public void updateExamSession(int id, ExamSession examSession)
    {
        examSessionRepository.save(examSession);
    }

    public void deleteExamSession(int id)
    {
        examSessionRepository.deleteById(id);
    }
}
