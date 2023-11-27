package com.springboot.employeeservice.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    Long id;
    String departmentName;
    String departmentDescription;
    String departmentCode;
}
