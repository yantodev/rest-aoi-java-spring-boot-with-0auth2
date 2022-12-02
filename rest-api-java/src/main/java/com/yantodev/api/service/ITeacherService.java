package com.yantodev.api.service;

import com.yantodev.api.model.Teacher;
import org.hibernate.service.spi.ServiceException;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAllTeacher() throws ServiceException;
}
