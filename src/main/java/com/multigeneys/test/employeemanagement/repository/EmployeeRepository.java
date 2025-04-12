package com.multigeneys.test.employeemanagement.repository;

import com.multigeneys.test.employeemanagement.dto.response.EmployeeResponseDto;
import com.multigeneys.test.employeemanagement.entity.Designation;
import com.multigeneys.test.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select * from fn_employee_list(?1, ?2,?3, ?4, ?5, ?6)", nativeQuery = true)
    List<EmployeeResponseDto> getEmployeeList(String searchString, Integer page, Integer size, Long designationId, Double employeeMinSal, Double employeeMaxSal);

    @Query(value = "select * from fn_get_all_employee_by_department_id(?1)", nativeQuery = true)
    List<EmployeeResponseDto> getAllEmployeesByDepartmentId(Long departmentId);
}
