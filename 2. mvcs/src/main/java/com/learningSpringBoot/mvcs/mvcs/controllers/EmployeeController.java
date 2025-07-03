package com.learningSpringBoot.mvcs.mvcs.controllers;

import com.learningSpringBoot.mvcs.mvcs.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    //
    @GetMapping(path = "/{employeeId}")
    // to use separate name of input url and code: @PathVariable(name = "employeeId")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId,"Satyam","Satyam@gmail.com",23, LocalDate.of(2024,1,1),true);
    }

    // some sample url to test
    // http://localhost:8080/employees?age=12&sortBy=name
    // http://localhost:8080/employees?age=12
    // http://localhost:8080/employees?
    // http://localhost:8080/employees
    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age,@RequestParam(required = false) String sortBy){
        return "Hi, Current Age: " + age + " sort on the basis of " + sortBy;
    }

    // to check post request, we have to use postman or terminal,as with
    // browser we can't generate post request directly
    @PostMapping
    // with requestBody we can send all the required fields for entry
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(10L);
        return inputEmployee;
    }

    @PutMapping
    String updateEmployeeById(){
        return "Put request!";
    }

}
