package com.microservices_project.department_service.service;

import com.microservices_project.department_service.entity.Department;
import com.microservices_project.department_service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment( Department department){
        log.info ( "Inside saveDepartment method of Department service" );
        return departmentRepository.save ( department );
    }
    public Department findDepartmentByid(Long departmentId){
        log.info ( "Inside saveDepartment method of Department service" );
        return departmentRepository.findDepartmentByid(departmentId);

    }
}
