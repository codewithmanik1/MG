package com.multigeneys.test.employeemanagement.dto.request;

import com.multigeneys.test.employeemanagement.entity.Designation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeFilterRequestDto {

    private Long designationId;

    private Double employeeMinSal;

    private Double employeeMaxSal;

    private String searchString;

    private Integer page;

    private Integer size;
}
