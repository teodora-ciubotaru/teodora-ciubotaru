package com.examsProject.exams.repository;


import com.examsProject.exams.domain.ExamSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamSessionRepository extends JpaRepository<ExamSession, Integer> {
}
