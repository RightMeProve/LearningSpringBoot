package com.learningSpringBoot.mvcs.mvcs.controllers;

import com.learningSpringBoot.mvcs.mvcs.dto.EmployeeDTO;
import com.learningSpringBoot.mvcs.mvcs.entities.EmployeeEntity;
import com.learningSpringBoot.mvcs.mvcs.repositories.EmployeeRepository;
import com.learningSpringBoot.mvcs.mvcs.services.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{employeeId}")
    // to use separate name of input url and code: @PathVariable(name = "employeeId")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return employeeService.findById(id);
    }

    // some sample url to test
    // http://localhost:8080/employees?age=12&sortBy=name
    // http://localhost:8080/employees?age=12
    // http://localhost:8080/employees?
    // http://localhost:8080/employees
    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age, @RequestParam(required = false) String sortBy){
        return employeeService.findAll();
    }

    // to check post request, we have to use postman or terminal,as with
    // browser we can't generate post request directly
    @PostMapping
    // with requestBody we can send all the required fields for entry
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping(path = "/{employeeId}")
    public EmployeeDTO updateEmployeeById(@RequestBody EmployeeDTO employeeDTO,@PathVariable Long employeeId){
        return employeeService.updateEmployeeById(employeeId,employeeDTO);
    }

    @DeleteMapping(path = "/{employeeId}")
    public boolean deleteEmployeeById(@PathVariable Long employeeId){
        return employeeService.deleteEmployeeById(employeeId);
    }

    @PatchMapping(path = "/{employeeId}")
    public EmployeeDTO updatePartialEmployeeById(@RequestBody Map<String, Object> updates,@PathVariable Long employeeId){
        return employeeService.updatePartialEmployeeById(employeeId,updates);
    }

}
