package com.learningSpringBoot.DataMapping.DataMapping.repositories;

import com.learningSpringBoot.DataMapping.DataMapping.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {

}
