package com.multigeneys.test.employeemanagement.repository;

import com.multigeneys.test.employeemanagement.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
}
