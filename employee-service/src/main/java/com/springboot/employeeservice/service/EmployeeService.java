package com.springboot.employeeservice.service;

import com.springboot.employeeservice.entity.APIResponse;
import com.springboot.employeeservice.entity.Department;
import com.springboot.employeeservice.entity.Employee;
import com.springboot.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
//    @Autowired
//    RestTemplate restTemplate;

      @Autowired
      WebClient webClient;



    //build post method to create an employee in the database
    public Employee createEmployee(Employee employee){
        Employee savedEmployee= employeeRepository.save(employee);
        return savedEmployee;
    }

    //method to find employee by id
    public APIResponse getEmployeeById(Long id){

        Employee employee= employeeRepository.findById(id).get();

//        ResponseEntity<Department> responseEntity =restTemplate.getForEntity("http://localhost:8080/api/department/"+employee.getDepartmentCode(),
//                                  Department.class);
//
//        Department department=responseEntity.getBody();

        Department department=webClient.get()
                .uri("http://localhost:8080/api/department/"+employee.getDepartmentCode())
                .retrieve()
                .bodyToMono(Department.class)
                .block();

        APIResponse apiResponse=new APIResponse();
        apiResponse.setEmployee(employee);
        apiResponse.setDepartment(department);


       return apiResponse;
    }
}
