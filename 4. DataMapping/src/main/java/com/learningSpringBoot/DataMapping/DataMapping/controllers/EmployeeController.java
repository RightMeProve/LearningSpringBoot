package com.learningSpringBoot.DataMapping.DataMapping.controllers;

import com.learningSpringBoot.DataMapping.DataMapping.entities.DepartmentEntity;
import com.learningSpringBoot.DataMapping.DataMapping.entities.EmployeeEntity;
import com.learningSpringBoot.DataMapping.DataMapping.services.DepartmentService;
import com.learningSpringBoot.DataMapping.DataMapping.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createNewEmployee(employeeEntity);
    }

}