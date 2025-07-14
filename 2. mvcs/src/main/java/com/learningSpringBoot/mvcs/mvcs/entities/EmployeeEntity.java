package com.learningSpringBoot.mvcs.mvcs.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity // convert this class to table in db
@Table(name = "employees")

//lombok dependency
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
    // fields inside the entity will be converted as column in the table

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dateOfJoining;
    private Boolean isActive;
}
