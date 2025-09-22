package com.yassine.department.repos;

import com.yassine.department.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepCode(String code);
}