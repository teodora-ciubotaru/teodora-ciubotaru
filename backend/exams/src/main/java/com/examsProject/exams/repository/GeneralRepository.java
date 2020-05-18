package com.examsProject.exams.repository;

import com.examsProject.exams.domain.General;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralRepository extends JpaRepository<General, Integer> {
}
