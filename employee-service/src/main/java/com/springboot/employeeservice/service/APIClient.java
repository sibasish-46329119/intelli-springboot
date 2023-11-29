package com.springboot.employeeservice.service;

import com.springboot.employeeservice.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080",value = "department-service")
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {
    // in this interface declare the method to call for communication
    @GetMapping("api/department/{department-code}")
    Department getDepartmentByDepartmentCode(@PathVariable("department-code") String departmentCode);
}
