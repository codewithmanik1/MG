package com.multigeneys.test.employeemanagement.service.impl;

import com.multigeneys.test.employeemanagement.common.ApiResponse;
import com.multigeneys.test.employeemanagement.dto.request.*;
import com.multigeneys.test.employeemanagement.dto.response.EmployeeResponseDto;
import com.multigeneys.test.employeemanagement.entity.Department;
import com.multigeneys.test.employeemanagement.entity.Designation;
import com.multigeneys.test.employeemanagement.entity.Employee;
import com.multigeneys.test.employeemanagement.entity.Salary;
import com.multigeneys.test.employeemanagement.repository.DepartmentRepository;
import com.multigeneys.test.employeemanagement.repository.DesignationRepository;
import com.multigeneys.test.employeemanagement.repository.EmployeeRepository;
import com.multigeneys.test.employeemanagement.repository.SalaryRepository;
import com.multigeneys.test.employeemanagement.service.EmployeeManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeManServiceImpl implements EmployeeManService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity<?> saveDepartment(DepartmentRequestDto departmentRequestDto) {
        var response = new ApiResponse<>();

        Department department = new Department();
        department.setDepartment(departmentRequestDto.getDepartment());
        departmentRepository.save(department);

        response.responseMethod(HttpStatus.CREATED.value(), "Data created successfully", null, null);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> saveDesignation(DesignationRequestDto designationRequestDto) {
        var response = new ApiResponse<>();

        Designation designation = new Designation();
        designation.setDesignation(designationRequestDto.getDesignation());
        designationRepository.save(designation);

        response.responseMethod(HttpStatus.CREATED.value(), "Data created successfully", null, null);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> saveSalary(SalaryRequestDto salaryRequestDto) {
        var response = new ApiResponse<>();

        Salary salary = new Salary();
        salary.setSalary(salaryRequestDto.getSalary());
        salaryRepository.save(salary);

        response.responseMethod(HttpStatus.CREATED.value(), "Data created successfully", null, null);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> saveEmployee(EmployeeRequestDto employeeRequestDto) {
        var response = new ApiResponse<>();

        Employee employee = new Employee();
        employee.setEmployeeName(employeeRequestDto.getEmployeeName());
        employee.setDepartmentId(employeeRequestDto.getDepartmentId());
        employee.setDesignationId(employeeRequestDto.getDesignationId());
        employee.setSalaryId(employeeRequestDto.getSalaryId());
        employee.setJoiningDate(employeeRequestDto.getJoiningDate());
        employeeRepository.save(employee);

        response.responseMethod(HttpStatus.CREATED.value(), "Data created successfully", null, null);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> getEmployeeData(EmployeeFilterRequestDto employeeFilterRequestDto) {
        var response = new ApiResponse<>();
        List<EmployeeResponseDto> employeeResponseList = employeeRepository.getEmployeeList(employeeFilterRequestDto.getSearchString(), employeeFilterRequestDto.getPage(), employeeFilterRequestDto.getSize(), employeeFilterRequestDto.getDesignationId() , employeeFilterRequestDto.getEmployeeMinSal(), employeeFilterRequestDto.getEmployeeMaxSal());

        if(!employeeResponseList.isEmpty()){
            response.responseMethod(HttpStatus.OK.value(), "Data fetch successfully", employeeResponseList, null);
        }else{
            response.responseMethod(HttpStatus.NOT_FOUND.value(), "Data not found", employeeResponseList, null);
        }

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> getEmployeesByDepartment(Long departmentId) {
        var response = new ApiResponse<>();
        List<EmployeeResponseDto> employeeResponseList = employeeRepository.getAllEmployeesByDepartmentId(departmentId);

        if (!employeeResponseList.isEmpty()) {
            response.responseMethod(HttpStatus.OK.value(), "Data fetch successfully", employeeResponseList, null);
        } else {
            response.responseMethod(HttpStatus.NOT_FOUND.value(), "Data not found", employeeResponseList, null);
        }

        return ResponseEntity.ok(response);
    }
}
