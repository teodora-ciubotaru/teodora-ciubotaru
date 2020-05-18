package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    Optional<Course> findById(int id);
}
