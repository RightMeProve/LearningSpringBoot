package com.learningSpringBoot.mvcs.mvcs.controllers;

import com.learningSpringBoot.mvcs.mvcs.dto.EmployeeDTO;
import com.learningSpringBoot.mvcs.mvcs.entities.EmployeeEntity;
import com.learningSpringBoot.mvcs.mvcs.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/{employeeId}")
    // to use separate name of input url and code: @PathVariable(name = "employeeId")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    // some sample url to test
    // http://localhost:8080/employees?age=12&sortBy=name
    // http://localhost:8080/employees?age=12
    // http://localhost:8080/employees?
    // http://localhost:8080/employees
    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age, @RequestParam(required = false) String sortBy){
        return employeeRepository.findAll();
    }

    // to check post request, we have to use postman or terminal,as with
    // browser we can't generate post request directly
    @PostMapping
    // with requestBody we can send all the required fields for entry
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputEmployee){
        return employeeRepository.save(inputEmployee);
    }

    @PutMapping
    String updateEmployeeById(){
        return "Put request!";
    }

}
