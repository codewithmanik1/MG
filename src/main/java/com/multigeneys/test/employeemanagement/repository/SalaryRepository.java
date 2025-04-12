package com.multigeneys.test.employeemanagement.repository;

import com.multigeneys.test.employeemanagement.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
