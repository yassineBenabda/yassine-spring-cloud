package com.yassine.department.service;

import com.yassine.department.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto getDepartmentByCode(String code);
}