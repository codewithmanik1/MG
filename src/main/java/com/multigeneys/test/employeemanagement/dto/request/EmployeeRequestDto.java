package com.multigeneys.test.employeemanagement.dto.request;

import com.multigeneys.test.employeemanagement.entity.Department;
import com.multigeneys.test.employeemanagement.entity.Designation;
import com.multigeneys.test.employeemanagement.entity.Salary;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeRequestDto {

    private String employeeName;

    private Designation designationId;

    private Department departmentId;

    private Salary salaryId;

    private LocalDate joiningDate = LocalDate.now();

}
