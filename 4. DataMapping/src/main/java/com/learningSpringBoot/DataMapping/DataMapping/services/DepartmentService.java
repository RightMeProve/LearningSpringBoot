package com.learningSpringBoot.DataMapping.DataMapping.services;

import com.learningSpringBoot.DataMapping.DataMapping.entities.DepartmentEntity;
import com.learningSpringBoot.DataMapping.DataMapping.entities.EmployeeEntity;
import com.learningSpringBoot.DataMapping.DataMapping.repositories.DepartmentRepository;
import com.learningSpringBoot.DataMapping.DataMapping.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository){
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public DepartmentEntity createNewDepartment(DepartmentEntity departmentEntity){
        return departmentRepository.save(departmentEntity);
    }

    public DepartmentEntity getDepartmentById(Long id){
        return departmentRepository.findById(id).orElse(null);
    }

    public DepartmentEntity assignManagerToDepartment(Long departmentId, Long employeeId) {
        Optional<DepartmentEntity> departmentEntity = departmentRepository.findById(departmentId);
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(employeeId);

        // Start processing the departmentEntity Optional:
        return departmentEntity.flatMap(department ->  // If departmentEntity is present, process its value. Otherwise, skip to orElse()
                        // Process employeeEntity inside the flatMap:
                        employeeEntity.map(employee -> {  // If employeeEntity is present, process its value. Otherwise, return empty Optional
                            // Both entities are present - update department:
                            department.setManager(employee);  // Set employee as manager for department
                            return departmentRepository.save(department);  // Persist changes and return saved department
                        })
                )  // flatMap result:
                //   - Optional.empty() if departmentEntity was empty
                //   - Result of employeeEntity.map() if departmentEntity was present
                //        (which could be empty if employeeEntity was empty)
                .orElse(null);  // Convert final Optional to:
        //   - null if any entity was missing
        //   - Saved department if both were present


        // or equivalent imperative code
//        if (departmentEntity.isPresent()) {
//            Department department = departmentEntity.get();
//            if (employeeEntity.isPresent()) {
//                Employee employee = employeeEntity.get();
//                department.setManager(employee);
//                Department savedDepartment = departmentRepository.save(department);
//                return savedDepartment;
//            }
//        }
//        return null;
    }

    public DepartmentEntity getAssignedDepartmentOfManager(Long employeeId) {
        // Create a minimal EmployeeEntity instance with only the ID populated
        // Why? We only need the employee ID to search for departments
        // How? Using the Builder pattern to create a partial entity
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .id(employeeId)  // Set ONLY the ID field
                .build();         // Construct the entity

        // Query the department repository to find the department where this employee is manager
        // How it works behind the scenes:
        // 1. JPA/Hibernate will use only the ID for the database query
        // 2. Generates SQL equivalent to:
        //    "SELECT * FROM departments WHERE manager_id = [employeeId]"
        return departmentRepository.findByManager(employeeEntity);
    }
}
