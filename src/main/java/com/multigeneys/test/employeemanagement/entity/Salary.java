package com.multigeneys.test.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "is_delete")
    private Boolean isDelete = false;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
