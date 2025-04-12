package com.multigeneys.test.employeemanagement.repository;

import com.multigeneys.test.employeemanagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
