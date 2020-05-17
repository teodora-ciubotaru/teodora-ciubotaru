package com.examsProject.exams.controller;

import com.examsProject.exams.domain.ExamSession;
import com.examsProject.exams.service.ExamSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExamSessionController {

    @Autowired
    private ExamSessionService examSessionService;

    @RequestMapping("/examSessions")
    public List<ExamSession> getAllExamSessions()
    {
        return examSessionService.getAllExamSessions();
    }

    /*error ambiguous path + eroare din examSessionsService
    @RequestMapping("/examSessions/{id}")
    public examSessions getexamSessionId(@PathVariable Long id)
    {
        return examSessionsService.getexamSessionId(id);
    }*/

    /*error ambiguous path
    @RequestMapping("/examSessions/{examSession_name}")
    public examSessions getexamSessionName(@PathVariable String examSession_name)
    {
        return examSessionsService.getexamSessionName(examSession_name);
    }
    */

    @RequestMapping(method = RequestMethod.POST, value = "/examSessions")
    public void addexamSession(@RequestBody ExamSession examSession)
    {
        examSessionService.addExamSession(examSession);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/examSessions/{id}")
    public void updateExamSession(@RequestBody ExamSession examSession, @PathVariable int id)
    {
        examSessionService.updateExamSession(id, examSession);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/examSessions/{id}")
    public void deleteExamSession(@PathVariable int id)
    {
        examSessionService.deleteExamSession(id);
    }
}
