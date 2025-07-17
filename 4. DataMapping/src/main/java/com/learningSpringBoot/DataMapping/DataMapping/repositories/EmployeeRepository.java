package com.learningSpringBoot.DataMapping.DataMapping.repositories;

import com.learningSpringBoot.DataMapping.DataMapping.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
