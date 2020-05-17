package com.examsProject.exams.repository;

import com.examsProject.exams.domain.Planning;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlanningRepository extends CrudRepository<Planning, Integer> {

    Optional<Planning> findById(int id);
}
