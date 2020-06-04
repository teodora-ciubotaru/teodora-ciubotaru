package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Exam;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ExamRepository {
    /**
     * Gets the exam with id = {id}
     * @param examId the exam id to select
     * @return an Exam
     */
    Exam getExamById(Integer examId);

    void updateExam(Integer id, String date, Integer numberOfSeats, String classroom);

    List<Map<String, Object>> getAllExams();

    void deleteExamById(Integer id);

    void insertExam(
            Integer universityYear,
            Integer studyYear,
            String section,
            Integer numberOfSeats,
            String subjectExam,
            String teacher,
            String classroom,
            Integer semester);
}
