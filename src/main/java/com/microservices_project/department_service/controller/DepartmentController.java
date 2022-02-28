package com.microservices_project.department_service.controller;

import com.microservices_project.department_service.entity.Department;
import com.microservices_project.department_service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Department method of department Controller");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentByid( @PathVariable("id") Long departmentId){
        log.info ( "Inside findDepartmentById method of DepartmentController" );
        return departmentService.findDepartmentByid(departmentId);
    }
}
