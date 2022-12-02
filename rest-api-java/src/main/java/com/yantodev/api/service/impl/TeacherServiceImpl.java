package com.yantodev.api.service.impl;

import com.yantodev.api.dao.ITeacherDao;
import com.yantodev.api.model.Teacher;
import com.yantodev.api.service.ITeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
@Service
public class TeacherServiceImpl implements ITeacherService {
    private final ITeacherDao teacherDao;

    @Override
    public List<Teacher> findAllTeacher() throws ServiceException {
        List<Teacher> teacher = teacherDao.findAll();
        return teacher;
    }
}
