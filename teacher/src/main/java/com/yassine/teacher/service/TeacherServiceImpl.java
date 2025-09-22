package com.yassine.teacher.service;

import com.yassine.teacher.dto.APIResponseDto;
import com.yassine.teacher.dto.DepartmentDto;
import com.yassine.teacher.dto.TeacherDto;
import com.yassine.teacher.entities.Teacher;
import com.yassine.teacher.repos.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    //  private WebClient webClient;

    private APIClient apiClient;

    @Override
    public APIResponseDto getTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();

        /*DepartmentDto departmentDto = webClient.get()
                .uri("http://localhost:8080/api/departments/" +
                        teacher.getDepCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();*/

        DepartmentDto departmentDto = apiClient.getDepByCode(teacher.getDepCode());

        TeacherDto teacherDto = new TeacherDto(
                teacher.getId(),
                teacher.getFirstName(),
                teacher.getLastName(),
                teacher.getDepCode(),
                departmentDto.getDepName()

        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setTeacherDto(teacherDto);
        apiResponseDto.setDepartmentDto(departmentDto);

        return apiResponseDto;

    }
}