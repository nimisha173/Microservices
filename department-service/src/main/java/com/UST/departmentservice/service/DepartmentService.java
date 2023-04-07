package com.UST.departmentservice.service;

import com.UST.departmentservice.entity.Department;
import com.UST.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;
    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
