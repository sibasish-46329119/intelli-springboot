package com.springboot.employeeservice.controller;

import com.springboot.employeeservice.entity.APIResponse;
import com.springboot.employeeservice.entity.Employee;
import com.springboot.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // post api method to create an employee
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee savedEmployee =employeeService.createEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    // get api method to find an employee by id
    @GetMapping("{id}")
    public ResponseEntity<APIResponse> getEmployeeById(@PathVariable("id") Long id){
        APIResponse apiResponse= employeeService.getEmployeeById(id);
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }
}
