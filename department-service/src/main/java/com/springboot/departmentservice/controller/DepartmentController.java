package com.springboot.departmentservice.controller;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    //@RequestBody annotation is used to parse json object from the client to department class object
    public ResponseEntity<Department> createDepartment(@RequestBody  Department department){
         Department savedDepartment = departmentService.createDepartment(department);
         return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{department-code}")
    public ResponseEntity<Department> getDepartmentByDepartmentCode(@PathVariable("department-code") String code){
        Department fetchedDepartment= departmentService.getDepartmentByCode(code);
        return  new ResponseEntity<>(fetchedDepartment,HttpStatus.OK);
    }


}

