package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Planning;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlanningRepository extends JpaRepository<Planning, Integer> {

    Optional<Planning> findById(int id);
}
