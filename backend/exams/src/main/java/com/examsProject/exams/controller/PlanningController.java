package com.examsProject.exams.controller;

import com.examsProject.exams.domain.Planning;
import com.examsProject.exams.service.PlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlanningController {

    @Autowired
    private PlanningService planningService;

    @RequestMapping("/plannings")
    public List<Planning> getAllPlannings()
    {
        return planningService.getAllPlannings();
    }

    @RequestMapping("/plannings/{id}")
    public Optional<Planning> getPlanningId(@PathVariable int id)
    {
        return planningService.getPlanningId(id);
    }

    /*error ambiguous path
    @RequestMapping("/plannings/{planning_name}")
    public Plannings getPlanningName(@PathVariable String planning_name)
    {
        return planningsService.getPlanningName(planning_name);
    }
    */

    @RequestMapping(method = RequestMethod.POST, value = "/plannings")
    public void addPlanning(@RequestBody Planning planning)
    {
        planningService.addPlanning(planning);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/plannings/{id}")
    public void updatePlanning(@RequestBody Planning planning, @PathVariable int id)
    {
        planningService.updatePlanning(id, planning);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/plannings/{id}")
    public void deletePlanning(@PathVariable int id)
    {
        planningService.deletePlanning(id);
    }
}
