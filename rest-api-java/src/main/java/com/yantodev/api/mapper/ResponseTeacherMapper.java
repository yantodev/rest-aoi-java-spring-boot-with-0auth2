package com.yantodev.api.mapper;

import com.yantodev.api.dto.response.pkl.teacher.ResponseTeacherDto;
import com.yantodev.api.model.Teacher;
import com.yantodev.api.util.core.dto.mapper.ADATAMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class ResponseTeacherMapper extends ADATAMapper<Teacher, ResponseTeacherDto> {
    @Override
    public ResponseTeacherDto convert(Teacher teacher) {
        return ResponseTeacherDto
                .builder()
                .userPublicId(1L)
                .name(teacher.getName())
                .nbm(teacher.getNbm())
                .email(teacher.getEmail())
                .position(teacher.getPosition())
                .hp(teacher.getHp())
                .build();
    }
}
