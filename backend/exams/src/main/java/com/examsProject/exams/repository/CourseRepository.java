package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Course;
import com.examsProject.exams.domain.Planning;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    Optional<Course> findById(int id);
}
