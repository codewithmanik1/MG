package com.multigeneys.test.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_name")
    private String employeeName;

    @ManyToOne
    @JoinColumn(name = "designation_id")
    private Designation designationId;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departmentId;

    @ManyToOne
    @JoinColumn(name = "salary_id")
    private Salary salaryId;

    @Column(name = "joining_date")
    private LocalDate joiningDate = LocalDate.now();

    @Column(name = "is_delete")
    private Boolean isDelete = false;

    @Column(name = "is_active")
    private Boolean isActive = true;
}
