package com.learningSpringBoot.DataMapping.DataMapping.repositories;

import com.learningSpringBoot.DataMapping.DataMapping.entities.DepartmentEntity;
import com.learningSpringBoot.DataMapping.DataMapping.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {

    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
