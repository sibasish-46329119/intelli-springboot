package com.springboot.departmentservice.repository;

import com.springboot.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

     Optional<Department> findByDepartmentCode(String code);
}
