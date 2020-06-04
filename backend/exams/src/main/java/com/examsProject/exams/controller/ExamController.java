package com.examsProject.exams.controller;

import com.examsProject.exams.domain.Exam;
import com.examsProject.exams.repository.provider.ExamProvider;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ExamController {
    private final ExamProvider Exam;

    public ExamController(ExamProvider exam) {
        this.Exam = exam;
    }

    @GetMapping("/exams/{id}")
    public Exam getExamsByIdAction(@PathVariable Integer id) {
        return this.Exam.getExamById(id);
    }

    @GetMapping("/exams")
    public List<Map<String, Object>> getExams() {
        return this.Exam.getAllExams();
    }

    @PutMapping("/exams/{id}")
    public @ResponseBody void updateExams(@PathVariable Integer id,
                                          @RequestBody Map<String, ?> requestBody) {
        this.Exam.updateExam(
                id,
                requestBody.get("date").toString(),
                Integer.parseInt(requestBody.get("numberOfSeats").toString()),
                requestBody.get("classroom").toString()
        );
    }

    @DeleteMapping("/exams/{id}")
    public @ResponseBody void deleteExam(@PathVariable Integer id) {
        this.Exam.deleteExamById(id);
    }

    @PostMapping("/exams")
    public @ResponseBody void insertExam(@RequestBody Map<String, ?> requestBody) {
        this.Exam.insertExam(
                Integer.parseInt(requestBody.get("universityYear").toString()),
                Integer.parseInt(requestBody.get("studyYear").toString()),
                requestBody.get("section").toString(),
                Integer.parseInt(requestBody.get("numberOfSeats").toString()),
                requestBody.get("subjectExam").toString(),
                requestBody.get("teacher").toString(),
                requestBody.get("classroom").toString(),
                Integer.parseInt(requestBody.get("semester").toString())
        );
    }
}
