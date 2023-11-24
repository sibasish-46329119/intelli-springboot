package com.springboot.departmentservice.service;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService {

    // using constructor injection to inject the departmentRepository bean
    // if single parameter dependency is there spring boot automatically inject that
    DepartmentRepository departmentRepository;

    // build save method to save the department data in database
    public Department createDepartment(Department department){
      Department savedDepartment= departmentRepository.save(department);
      return savedDepartment;
    }

    // build get method to fetch the department based on the departmentCode
    public Department getDepartmentByCode(String code){
     Department fetchedDepartment= departmentRepository.findByDepartmentCode(code).get();
     return fetchedDepartment;
    }

}
