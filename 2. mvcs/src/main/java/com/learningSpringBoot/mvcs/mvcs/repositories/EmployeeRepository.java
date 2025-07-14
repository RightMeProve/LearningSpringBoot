package com.learningSpringBoot.mvcs.mvcs.repositories;

import com.learningSpringBoot.mvcs.mvcs.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
