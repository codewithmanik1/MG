package com.multigeneys.test.employeemanagement.controller;

import com.multigeneys.test.employeemanagement.dto.request.*;
import com.multigeneys.test.employeemanagement.service.EmployeeManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee-management")
public class EmployeeManController {

    @Autowired
    public EmployeeManService employeeManService;

    //This Api for Q1) , This api is include one database function , which i have also mentioned in this repo in database functions folder
    @PostMapping("/getEmployeeData")
    public ResponseEntity<?> getEmployeeDate(@RequestBody EmployeeFilterRequestDto employeeFilterRequestDto){
        return employeeManService.getEmployeeData(employeeFilterRequestDto);
    }

    //This Api for Q2)
    @PostMapping("/saveDepartment")
    public ResponseEntity<?> saveDepartment(@RequestBody DepartmentRequestDto departmentRequestDto){
        return employeeManService.saveDepartment(departmentRequestDto);
    }

    //This api for Q3)
    @PostMapping("/saveEmployee")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        return employeeManService.saveEmployee(employeeRequestDto);
    }

    //This api for Q4)
    //Her i used database function again in service impl but we can also use JPA query here
    @GetMapping("/getEmployeesByDepartment/{departmentId}")
    public ResponseEntity<?> getEmployeesByDepartment(@PathVariable Long departmentId){
        return employeeManService.getEmployeesByDepartment(departmentId);
    }

    @PostMapping("/saveDesignation")
    public ResponseEntity<?> saveDesignation(@RequestBody DesignationRequestDto designationRequestDto){
        return employeeManService.saveDesignation(designationRequestDto);
    }

    @PostMapping("/saveSalary")
    public ResponseEntity<?> saveSalary(@RequestBody SalaryRequestDto salaryRequestDto){
        return employeeManService.saveSalary(salaryRequestDto);
    }

}
