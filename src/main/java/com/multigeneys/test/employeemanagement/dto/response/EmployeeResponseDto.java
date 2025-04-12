package com.multigeneys.test.employeemanagement.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "Sr No.",
        "Id",
        "Employee Name",
        "Department",
        "Designation",
        "Salary",
        "IsActive"
})
public interface EmployeeResponseDto {

    @JsonProperty("Sr No.")
    Long getSrNo();

    @JsonProperty("Id")
    Long getId();

    @JsonProperty("Employee Name")
    String getEmpName();

    @JsonProperty("Department")
    String getEmpDep();

    @JsonProperty("Designation")
    String getEmpDesignation();

    @JsonProperty("Salary")
    Double getEmpSalary();

    @JsonProperty("IsActive")
    Boolean getStatus();
}