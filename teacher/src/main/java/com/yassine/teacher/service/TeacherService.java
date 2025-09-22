package com.yassine.teacher.service;

import com.yassine.teacher.dto.APIResponseDto;

public interface TeacherService {
    APIResponseDto getTeacherById(Long id);
}
