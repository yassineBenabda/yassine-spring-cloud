package com.yassine.department.service;

import com.yassine.department.dto.DepartmentDto;
import com.yassine.department.entities.Department;
import com.yassine.department.repos.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {


    private  DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department dep = departmentRepository.findByDepCode(code);

        DepartmentDto departmentDto = new DepartmentDto(
                dep.getId(),
                dep.getDepName(),
                dep.getDepCode()
        );

        return departmentDto;
    }
}
