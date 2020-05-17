package com.examsProject.exams.service;

import com.examsProject.exams.domain.Planning;
import com.examsProject.exams.repository.PlanningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanningService {

    @Autowired
    private PlanningRepository planningRepository;

    public List<Planning> getAllPlannings()
    {
        List<Planning> plannings = new ArrayList<>();
        planningRepository.findAll().forEach(plannings::add);
        return plannings;
    }

    /*returneaza un curs dupa id
  public Plannings getPlanningId(Long id) {
      //return plannings.stream().filter(c -> c.getPlanning_id().equals(id)).findFirst().get();
      return planningsRepository.findOne(id);
  }

    public Plannings getPlanningName(String planning_name) {
        return plannings.stream().filter(c -> c.getPlanning_name().equals(planning_name)).findFirst().get();
    }*/


    public void addPlanning(Planning planning) {
        planningRepository.save(planning);
    }

    public void updatePlanning(int id, Planning planning)
    {
        planningRepository.save(planning);
    }

    public void deletePlanning(int id)
    {
        planningRepository.deleteById(id);
    }
}
