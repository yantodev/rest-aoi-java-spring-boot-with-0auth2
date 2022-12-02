package com.yantodev.api.endpoint.impl;

import com.yantodev.api.dto.response.pkl.teacher.ResponseTeacherDto;
import com.yantodev.api.endpoint.ITeacherEndpoint;
import com.yantodev.api.mapper.ResponseTeacherMapper;
import com.yantodev.api.model.Teacher;
import com.yantodev.api.service.ITeacherService;
import com.yantodev.api.util.IResultDTO;
import com.yantodev.api.util.core.dto.APIResponseBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TeacherEndpointImpl implements ITeacherEndpoint {
    private final ITeacherService teacherService;
    private final ResponseTeacherMapper responseTeacherMapper;

    @Override
    public IResultDTO<List<ResponseTeacherDto>> findAll() {

        List<Teacher> teacher = teacherService.findAllTeacher();
        return APIResponseBuilder.ok(responseTeacherMapper.mapEntitiesIntoDTOs(teacher));
    }
}
