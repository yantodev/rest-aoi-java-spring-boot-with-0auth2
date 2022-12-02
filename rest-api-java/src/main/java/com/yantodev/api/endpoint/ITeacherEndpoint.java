package com.yantodev.api.endpoint;

import com.yantodev.api.dto.response.pkl.teacher.ResponseTeacherDto;
import com.yantodev.api.util.IResultDTO;
import com.yantodev.api.util.statval.IApplicationConstant;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RequestMapping(value = IApplicationConstant.ContextPath.Pkl.TEACHER,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public interface ITeacherEndpoint {
    @GetMapping(IApplicationConstant.path.teacher.FIND_ALL)
    IResultDTO<List<ResponseTeacherDto>> findAll();
}
