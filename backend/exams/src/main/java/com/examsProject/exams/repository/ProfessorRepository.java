package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Course;
import com.examsProject.exams.domain.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
}
