package com.springboot.employeeservice.service;

import com.springboot.employeeservice.entity.Employee;
import com.springboot.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    //build post method to create an employee in the database
    public Employee createEmployee(Employee employee){
        Employee savedEmployee= employeeRepository.save(employee);
        return savedEmployee;
    }

    //method to find employee by id
    public Employee getEmployeeById(Long id){
       Employee fetchedEmployee= employeeRepository.findById(id).get();
       return fetchedEmployee;
    }
}
