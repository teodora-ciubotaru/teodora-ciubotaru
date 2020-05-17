package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
