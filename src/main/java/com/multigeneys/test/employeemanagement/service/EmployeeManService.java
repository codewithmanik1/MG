package com.multigeneys.test.employeemanagement.service;

import com.multigeneys.test.employeemanagement.dto.request.*;
import org.springframework.http.ResponseEntity;

public interface EmployeeManService {

    ResponseEntity<?> saveDepartment(DepartmentRequestDto departmentRequestDto);

    ResponseEntity<?> saveDesignation(DesignationRequestDto designationRequestDto);

    ResponseEntity<?> saveSalary(SalaryRequestDto salaryRequestDto);

    ResponseEntity<?> saveEmployee(EmployeeRequestDto employeeRequestDto);

    ResponseEntity<?> getEmployeeData(EmployeeFilterRequestDto employeeFilterRequestDto);

    ResponseEntity<?> getEmployeesByDepartment(Long departmentId);
}
