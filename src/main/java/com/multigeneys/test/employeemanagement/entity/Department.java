package com.multigeneys.test.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department")
    private String department;

    @Column(name = "is_delete")
    private Boolean isDelete = false;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
