package com.yassine.teacher.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yassine.teacher.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}