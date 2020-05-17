package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Course;
import com.examsProject.exams.domain.ExamSession;
import org.springframework.data.repository.CrudRepository;

public interface ExamSessionRepository extends CrudRepository<ExamSession, Integer> {
}
