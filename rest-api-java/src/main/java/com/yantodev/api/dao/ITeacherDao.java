package com.yantodev.api.dao;

import com.yantodev.api.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherDao extends JpaRepository<Teacher, Long> {
}
