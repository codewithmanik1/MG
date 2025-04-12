package com.multigeneys.test.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "designation")
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "is_delete")
    private Boolean isDelete = false;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
